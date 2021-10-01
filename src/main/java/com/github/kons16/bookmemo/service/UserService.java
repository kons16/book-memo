package com.github.kons16.bookmemo.service;

import com.github.kons16.bookmemo.repository.mysql.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public void storeUser(String name, String email, String passwordHash) {
        userRepository.storeUser(name, email, passwordHash);
    }
}