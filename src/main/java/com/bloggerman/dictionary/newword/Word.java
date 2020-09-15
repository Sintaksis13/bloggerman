package com.bloggerman.dictionary.newword;

import javax.persistence.*;

@Entity(name = "word")
public class Word {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String originalWord;

    @Column(unique = true)
    private String translatedWord;

    private long saveTime;

    public Word() {
    }

    public Word(String originalWord, String translatedWord) {
        this.originalWord = originalWord;
        this.translatedWord = translatedWord;
        this.saveTime = System.currentTimeMillis();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOriginalWord() {
        return originalWord;
    }

    public void setOriginalWord(String originalWord) {
        this.originalWord = originalWord;
    }

    public String getTranslatedWord() {
        return translatedWord;
    }

    public void setTranslatedWord(String translatedWord) {
        this.translatedWord = translatedWord;
    }

    public long getSaveTime() {
        return saveTime;
    }

    public void setSaveTime(long saveTime) {
        this.saveTime = saveTime;
    }
}
