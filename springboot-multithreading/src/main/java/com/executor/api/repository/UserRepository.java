package com.executor.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.executor.api.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {
}
