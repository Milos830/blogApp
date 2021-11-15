package com.milos.testiranjebazeblog.service;

import com.milos.testiranjebazeblog.entity.Comment;
import com.milos.testiranjebazeblog.repository.CommentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CommentService {

    private final CommentRepository commentRepository;

    public Comment save(Comment comment) {
        return commentRepository.saveAndFlush(comment);
    }


}
