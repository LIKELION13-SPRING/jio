package com.example.SpringDeveloper_chap6.repository;

import com.example.SpringDeveloper_chap6.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article,Long> {
}
