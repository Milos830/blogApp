package com.milos.testiranjebazeblog.controller;


import com.milos.testiranjebazeblog.dto.UserDTO;
import com.milos.testiranjebazeblog.entity.Category;
import com.milos.testiranjebazeblog.entity.Post;
import com.milos.testiranjebazeblog.service.PostService;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@AllArgsConstructor
public class HomeController {

    private final PostService postService;


    @GetMapping("/")
    public String index () {
        return "index";
    }





//    @GetMapping("/login")
//    public String login(){
//
//        return "login";
//    }
//
//    @RequestMapping("/register")
//    public String register() {
//        return "registration";
//    }







}
