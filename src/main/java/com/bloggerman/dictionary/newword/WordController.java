package com.bloggerman.dictionary.newword;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("dictionary")
public class WordController {
    private final WordDao WordDao;

    public WordController(WordDao WordDao) {
        this.WordDao = WordDao;
    }

    @PostMapping("new-word")
    public List<Word> saveNewWord(@RequestBody NewWord newWord) {
        Word word = new Word(newWord.getOriginalWord(), newWord.getTranslatedWord());
        WordDao.save(word);
        return WordDao.findRecentWords();
    }

    @GetMapping("recent-words")
    public List<Word> getRecentWords() {
        return WordDao.findRecentWords();
    }
}
