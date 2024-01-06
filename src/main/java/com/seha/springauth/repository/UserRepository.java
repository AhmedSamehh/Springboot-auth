package com.seha.springauth.repository;

import com.seha.springauth.model.User;

import java.util.Optional;

public interface UserRepository {
    Optional<User> findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
}
