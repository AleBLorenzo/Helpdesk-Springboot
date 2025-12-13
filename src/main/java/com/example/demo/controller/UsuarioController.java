package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @GetMapping("/{id}")

    public Usuario getIdUsers(@PathVariable Long id) {

        return userservice.getIdUsuarios(id);

    }

    @PostMapping
    public Usuario postUsers(@RequestBody Usuario usuario) {

        return userservice.PostInfo(usuario);
    }

    @PutMapping("/{id}")
    public Usuario PutUsers(@PathVariable Long id, @RequestBody Usuario usuarioactualizado) {

        Usuario userexistente = userservice.getIdUsuarios(id);

        userexistente.setNombre(usuarioactualizado.getNombre());
        userexistente.setEmail(usuarioactualizado.getEmail());
        userexistente.setIncidencias(usuarioactualizado.getIncidencias());

        return userservice.PostInfo(userexistente);
    }

    @DeleteMapping("/{id}")
    public String DeleteUsers(@PathVariable Long id) {

        Usuario usuario = userservice.getIdUsuarios(id);

        if (usuario == null) {
            return "Usuario no encontrado";
        }
        userservice.DeleteUser(usuario);
        return "Usuario eliminado correctamente";

    }

}
