package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Usuario;
import com.example.demo.service.UsuarioService;

@RestController
@RequestMapping("/api/usuario")

public class UsuarioController {

    private UsuarioService userservice;

    public UsuarioController(UsuarioService userservice) {
        this.userservice = userservice;
    }

    @GetMapping

    public List<Usuario> getAllUsers() {

        return userservice.getAllUsuarios();

    }

}
