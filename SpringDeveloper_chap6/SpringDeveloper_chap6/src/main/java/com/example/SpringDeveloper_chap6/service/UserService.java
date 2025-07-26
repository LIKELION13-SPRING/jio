package com.example.SpringDeveloper_chap6.service;

import com.example.SpringDeveloper_chap6.domain.User;
import com.example.SpringDeveloper_chap6.dto.AddUserRequest;
import com.example.SpringDeveloper_chap6.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    
    public Long save(AddUserRequest dto){
        return userRepository.save(User.builder().email(dto.getEmail())
                .password(bCryptPasswordEncoder.encode(dto.getPassword()))
                .build()).getId();
    }
}
