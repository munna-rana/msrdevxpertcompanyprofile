package com.msrdevxpert.msrDevXpertpProfile.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "Welcome to MSR DevXpert!";
    }
}
