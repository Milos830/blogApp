package com.milos.testiranjebazeblog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Table(name = "tag")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Tag {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;


    @ManyToOne(optional = false)
    @JoinColumn(name = "post_id", nullable = false)
    private Post post;

    @Column(name = "tag_name")
    private String tagName;


}