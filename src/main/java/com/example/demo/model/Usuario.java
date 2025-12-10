package com.example.demo.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity

public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_usuario;

    private String nombre;
    private String email;

    @OneToMany(mappedBy = "usuario")
    private List<Incidencia> incidencias;

 
    @OneToMany(mappedBy = "usuario")
    private List<Comentario> comentarios;
    
    public long getId_usuario() {
        return id_usuario;
    }
    public void setId_usuario(long id_usuario) {
        this.id_usuario = id_usuario;
    }
    public List<Incidencia> getIncidencias() {
        return incidencias;
    }
    public void setIncidencias(List<Incidencia> incidencias) {
        this.incidencias = incidencias;
    }
    public List<Comentario> getComentarios() {
        return comentarios;
    }
    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
}
