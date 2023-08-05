package com.ayu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    @GetMapping
    public String selectAll(){
        System.out.println("springboot is running");
        System.out.println("git test");
        return "springboot is running";
    }
}
