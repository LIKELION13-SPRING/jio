package com.example.SpringDeveloper_chap6.dto;

import com.example.SpringDeveloper_chap6.domain.Article;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AddArticleRequest {
    private String title;
    private String content;

    public Article toEntity(){
        return Article.builder()
                .title(title)
                .content(content)
                .build();
    } //builder를 사용하는 이유는 가독성을 높이기 위해서
}
