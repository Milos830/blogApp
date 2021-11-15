package com.milos.testiranjebazeblog.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class UserDTO {

    @NotEmpty(message = "*Please provide Email")
    @Email(message = "*Please provide valid Email")
    private String email;

    @NotEmpty(message = "*Please provide your password")
    @Length(min = 6, message = "Your password must have at least 6 characters")
    private String password;

    @NotEmpty(message = "*Please re-enter your password")
    private String rpassword;

    @NotEmpty(message = "*Please provide your first name")
    private String firstname;
    @NotEmpty(message = "*Please provide your last name")
    private String lastname;

}
