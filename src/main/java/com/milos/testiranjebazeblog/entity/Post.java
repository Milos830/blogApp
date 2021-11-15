package com.milos.testiranjebazeblog.entity;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;

import java.time.Instant;
import java.util.List;


import static javax.persistence.FetchType.*;

@Table(name = "post")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "post_id")
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "body", columnDefinition = "TEXT")
    private String body;

    @Column(name = "create_date", nullable = false, updatable = false)
    private Instant createDate;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "user_id", nullable = false)
    private User user;

    @OneToMany(mappedBy = "post", cascade = CascadeType.REMOVE)
    private List<Comment> comments;


    @OneToMany(mappedBy = "post")
    private List<Category> categories;


    @Transient
    private MultipartFile postImage;



//    @Column(name = "updated_at")
//    private Instant updatedAt;
//
//    @Column(name = "is_active")
//    private Boolean isActive = true;
//
//    @Column(name = "published_by")
//    private String publishedBy;
}