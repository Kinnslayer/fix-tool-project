package com.rodrigo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class FixToolController {

    @GetMapping("/")
    public String mensagem() {
        return "Hello World!!";
    }

    
}
