package com.bloggerman.dictionary.newword;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordDao {
    private final WordRepository repository;

    public WordDao(WordRepository repository) {
        this.repository = repository;
    }

    public Word save(Word word) {
        return repository.save(word);
    }

    public List<Word> findRecentWords() {
        return repository.findFirst5ByOrderBySaveTimeDesc();
    }
}
