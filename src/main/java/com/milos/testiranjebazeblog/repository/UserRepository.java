package com.milos.testiranjebazeblog.repository;

import com.milos.testiranjebazeblog.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}