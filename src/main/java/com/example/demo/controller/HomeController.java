package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@ResponseBody
public class HomeController {

    @GetMapping()
    public String mensaje(){
        return "Hola desde el mundo Spring boot";
    }

    @GetMapping("/hello")
    public String mensaje2(){
        return  "Hola desde el mundo Spring boot";
    }
}
