package com.milos.testiranjebazeblog.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;


import java.util.List;


import static javax.persistence.GenerationType.AUTO;


@Table(name = "user")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = AUTO)
    @Column(name = "user_id")
    private Long id;

    @Column(name = "email", unique = true, nullable = false)
    @Email(message = "*Please provide valid Email")
    @NotEmpty(message = "*Please provide Email")
    private String email;

    @Column(name = "password", nullable = false)
    @JsonIgnore
    @NotEmpty(message = "*Please provide your password")
    @Length(min = 5, message = "Your password must have at least 5 characters")
    private String password;




    @Column(name = "user_name", nullable = false, unique = true)
    @NotEmpty(message = "Please provide your name")
    private String username;

    @Column(name = "first_name")
    @NotEmpty(message = "*Please provide your first name")
    private String firstName;

    @NotEmpty(message = "*Please provide you last name")
    @Column(name = "last_name")
    private String lastName;


    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private List<Role> roles;

    @OneToMany(mappedBy = "user")
    private List<Post> posts;


//    private Boolean enabled;



//    @Column(name = "mobile")
//    private String mobile;
//
//    @Column(name = "last_login")
//    private LocalDateTime lastLogin;
//
//    @Column(name = "profile")
//    private String profile;


}