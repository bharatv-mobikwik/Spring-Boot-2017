package com.bharat.nosql.elastic;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Created by BHARAT VERMA on 26/2/17.
 */
public interface ArticleService {
    Article save(Article article);

    Article findOne(String id);

    Iterable<Article> findAll();

    Page<Article> findByAuthorName(String name, Pageable pageable);

    Page<Article> findByAuthorNameUsingCustomQuery(String name, Pageable pageable);

    long count();

    void delete(Article article);
}
