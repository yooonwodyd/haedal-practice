package com.example.demo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Getter
@NoArgsConstructor
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;   // 게시물 id

    @Setter
    private String titile;    //게시물 제목
    @Setter private String content;   // 게시물 내용
    @Setter private String username;   // 유저이름

    protected Article(Long id, String title, String content, String username) {
        this.id = id;
        this.titile = title;
        this.content = content;
        this.username = username;
    }

    public static Article of(Long id, String title, String content, String username){
        return new Article(id,title,content,username);
    }
}

