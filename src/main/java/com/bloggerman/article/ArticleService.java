package com.bloggerman.article;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class ArticleService {
    private final ArticleRepository repository;

    public ArticleService(ArticleRepository repository) {
        this.repository = repository;
    }

    public List<Article> findAll() {
        return StreamSupport
                .stream(repository.findAll().spliterator(), true)
                .collect(Collectors.toList());
    }
}
