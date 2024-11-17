package com.example.full_spring_security.repository;

import com.example.full_spring_security.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users, Integer> {
    Optional<Users> findByUsername(String username);
}
