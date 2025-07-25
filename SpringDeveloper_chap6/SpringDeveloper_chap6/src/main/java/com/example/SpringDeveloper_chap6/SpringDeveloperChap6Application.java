package com.example.SpringDeveloper_chap6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing //created_at, updated_at 자동 업데이트
@SpringBootApplication
public class SpringDeveloperChap6Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringDeveloperChap6Application.class, args);
	}

}
