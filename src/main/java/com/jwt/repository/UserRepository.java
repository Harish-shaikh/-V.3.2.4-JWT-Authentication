package com.jwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jwt.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByUsername(String username);
}