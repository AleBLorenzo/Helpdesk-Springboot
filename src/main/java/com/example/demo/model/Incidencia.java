package com.example.demo.model;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity

public class Incidencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    private String titulo;
    private String descripcion;
    private String prioridad;
    private String estado;
    private LocalDate fechacreacion;

    //Especifica de de incidecia a Usuario de de muchos a uno
    @ManyToOne
    @JoinColumn(name = "fk_usuario") 
    //especifica q esta es la hija cortando asi en buche
    //Aclarar q solo sirve para relacion uno a muchos si es muchos a mucho se utilizaria @JsonIgnore(Algo rapido si es pequeño el proyecto)
    //Mejor si es profeciona utilizar DTOs
    
    @JsonBackReference
    private Usuario usuario;

    @OneToMany(mappedBy = "incidencia")
    @JsonManagedReference
    private List<Comentario> comentarios;
    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public List<Comentario> getComentarios() {
        return comentarios;
    }
    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getPrioridad() {
        return prioridad;
    }
    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public LocalDate getFechacreacion() {
        return fechacreacion;
    }
    public void setFechacreacion(LocalDate fechacreacion) {
        this.fechacreacion = fechacreacion;
    }
}
