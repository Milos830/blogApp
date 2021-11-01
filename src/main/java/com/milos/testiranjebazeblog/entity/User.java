package com.milos.testiranjebazeblog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Table(name = "user")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Post> posts;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "password", unique = true)
    private String password;

    @Column(name = "profile")
    private String profile;

    @Column(name = "registred_at", nullable = true)
    private LocalDateTime registredAt;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "last_login")
    private LocalDateTime lastLogin;


}