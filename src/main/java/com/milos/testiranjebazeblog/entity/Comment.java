package com.milos.testiranjebazeblog.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Table(name = "post_comment")
@Entity
public class Comment {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "post_id", nullable = false)
    private Post post;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "com_content")
    private String comContent;


}