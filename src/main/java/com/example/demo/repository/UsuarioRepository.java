package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

List<Usuario> findByNombreAndEmail(String nombre, String email);
  
boolean existsByNombre (String nombre);

}
