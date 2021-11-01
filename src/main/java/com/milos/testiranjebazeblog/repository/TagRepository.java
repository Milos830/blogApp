package com.milos.testiranjebazeblog.repository;

import com.milos.testiranjebazeblog.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag, Long> {
}