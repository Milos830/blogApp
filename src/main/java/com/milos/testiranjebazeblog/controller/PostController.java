package com.milos.testiranjebazeblog.controller;

import com.milos.testiranjebazeblog.entity.Post;
import com.milos.testiranjebazeblog.service.CategoryService;
import com.milos.testiranjebazeblog.service.PostService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@AllArgsConstructor

public class PostController {

    private final PostService postService;
    private final CategoryService categoryService;

    @RequestMapping(value = "/posts", method = RequestMethod.GET)
    public String list(Model model){
        model.addAttribute("posts", postService.listAllPosts());
        System.out.println("Returning rpoducts:");
        return "posts";
    }

    @RequestMapping("post/{id}")
    public String showProduct(@PathVariable Long id, Model model){
        model.addAttribute("post", postService.findPostById(id));
        return "posts";
    }

    @GetMapping(value = "/post")
    public String getAllPost(Model model) {
        model.addAttribute("posts", postService.listAllPosts());
        model.addAttribute("categories", categoryService.getAllCategories());
        return "postsForm";
    }

    @RequestMapping("/post/new")
    public String addPost(Post post) {
        postService.savePost(post);
        return "postsForm";
    }





}
