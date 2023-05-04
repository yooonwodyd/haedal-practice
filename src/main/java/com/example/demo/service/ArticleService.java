package com.example.demo.service;


import com.example.demo.repositroy.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {
    private final ArticleRepository postsRepository;

    @Autowired
    public ArticleService(ArticleRepository postsRepository) {
        this.postsRepository = postsRepository;
    }
}
