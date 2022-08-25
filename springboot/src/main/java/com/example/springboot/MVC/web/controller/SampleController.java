package com.example.springboot.MVC.web.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class SampleController {
    @GetMapping("/sample")
    public String showForm() {
        return "sample";
    }
}
