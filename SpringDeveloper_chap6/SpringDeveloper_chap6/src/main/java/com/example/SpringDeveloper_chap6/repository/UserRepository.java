package com.example.SpringDeveloper_chap6.repository;

import com.example.SpringDeveloper_chap6.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String username); //email로 사용자 정보를 가져옴.
}
