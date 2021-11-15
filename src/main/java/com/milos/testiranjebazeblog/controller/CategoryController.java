package com.milos.testiranjebazeblog.controller;

import com.milos.testiranjebazeblog.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;


}
