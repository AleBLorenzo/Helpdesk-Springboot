package com.example.demo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    public ResponseEntity<Object> getIdUsers(@PathVariable Long id) {

        try {

            Usuario usuario = userservice.getIdUsuarios(id);
            return ResponseEntity.ok(usuario);

        } catch (RuntimeException e) {

            return ResponseEntity.notFound().build();
        }

    }

    @GetMapping("/buscar")

    public List<Usuario> getByUserEmailUsers(@RequestParam String nombre, String email) {

        return userservice.getfindByUsuarios(nombre, email);
    }

    @PostMapping
    public Usuario postUsers(@RequestBody Usuario usuario) {

        return userservice.PostInfo(usuario);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Usuario> PutUsers(@PathVariable Long id, @RequestBody Usuario usuarioactualizado) {

        try {
            Usuario userexistente = userservice.getIdUsuarios(id);

            if (userexistente == null) {
                return null;
            }

            if (usuarioactualizado.getNombre() != null) {
                userexistente.setNombre(usuarioactualizado.getNombre());
            }

            if (usuarioactualizado.getEmail() != null) {
                userexistente.setEmail(usuarioactualizado.getEmail());
            }

            if (usuarioactualizado.getIncidencias() != null) {
                userexistente.setIncidencias(usuarioactualizado.getIncidencias());

            }

            Usuario actualizado = userservice.PostInfo(userexistente);
            return ResponseEntity.ok(actualizado);

        } catch (RuntimeException e) {

            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> DeleteUsers(@PathVariable Long id) {

        try {

            Usuario usuario = userservice.getIdUsuarios(id);
            userservice.DeleteUser(usuario);

            return ResponseEntity.noContent().build();

        } catch (RuntimeException e) {

            return ResponseEntity.notFound().build();
        }
    }

}
