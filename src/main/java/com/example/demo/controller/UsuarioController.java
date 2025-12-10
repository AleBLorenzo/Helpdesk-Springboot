package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/usuario")

public class UsuarioController {


     @GetMapping("getall")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }

}
