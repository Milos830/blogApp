package com.milos.testiranjebazeblog.entity;

import javax.persistence.*;

@Table(name = "category")
@Entity
public class Category {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToOne(mappedBy = "category", orphanRemoval = true)
    private Post post;

    @Column(name = "cat_name")
    private String catName;

}