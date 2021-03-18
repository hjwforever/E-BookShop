package edu.bjtu.example.ebookshop.controller;

import edu.bjtu.example.ebookshop.entity.Roles;
import edu.bjtu.example.ebookshop.entity.User;
import edu.bjtu.example.ebookshop.repository.RolesRepository;
import edu.bjtu.example.ebookshop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright(C), 2020-2021, aruoxi.com
 * FileName: HelloWorldController
 * Author: hjwforever
 * Date: 2021/3/14 001414:30
 * Description:
 */
@Controller
public class HelloWorldController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/helloworld")
    public String helloWorld() {
        return "hello world";
    }

    @GetMapping(value = "/index")
    public String index(Model model) {
        model.addAttribute("uid","123456789");
        model.addAttribute("name","Jerry");

        model.addAttribute("user",userRepository.findById(3L).get());
        return "home-index";
    }
}
