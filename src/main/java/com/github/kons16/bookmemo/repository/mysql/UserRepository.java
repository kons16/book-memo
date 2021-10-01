package com.github.kons16.bookmemo.repository.mysql;

public interface UserRepository {
    void storeUser(String name, String email, String passwordHash);
}