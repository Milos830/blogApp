package com.milos.testiranjebazeblog.controller;

import com.milos.testiranjebazeblog.dto.UserDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class AccountController {


    private final static Logger log = LoggerFactory.getLogger(AccountController.class);

    @InitBinder
    public void initBinder(WebDataBinder dataBinder) {
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

    @GetMapping("/register")
    public String register(@ModelAttribute UserDTO userDto, Model model){
        model.addAttribute("userDto", userDto);
        return "register";
    }

        @PostMapping("/register")
        public String save(@Valid UserDTO userDTO, BindingResult bindingResult){

            if(bindingResult.hasErrors()){
                return "register";
            }
        log.info(">> userDTO : {}", userDTO.toString());
        return "redirect:/login";
    }
}
