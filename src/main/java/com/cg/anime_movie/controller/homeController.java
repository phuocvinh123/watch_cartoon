package com.cg.anime_movie.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class homeController {
    @GetMapping("/index")
    public String home (){
        return "views/index";
    }
}
