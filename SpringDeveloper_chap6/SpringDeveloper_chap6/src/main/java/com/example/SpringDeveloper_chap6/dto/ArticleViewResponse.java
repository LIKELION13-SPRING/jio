package com.example.SpringDeveloper_chap6.dto;

import com.example.SpringDeveloper_chap6.domain.Article;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
public class ArticleViewResponse {

    private Long id;
    private String title;
    private String content;
    private LocalDateTime createdAt;

    public ArticleViewResponse(Article article){
        this.id=article.getId();
        this.title=article.getTitle();
        this.content=article.getContent();
        this.createdAt=article.getCreatedAt();
    }
}
