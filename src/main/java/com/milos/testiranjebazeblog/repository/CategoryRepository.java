package com.milos.testiranjebazeblog.repository;

import com.milos.testiranjebazeblog.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}