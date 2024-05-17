package com.example.md4_b5th_orm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {
    @GetMapping("/demo")
    public String demo() {
        return "index";
    }
}
