package com.example.demo.model;

import java.time.LocalDateTime;
import java.util.List;

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
    private long id_incidencia;
    
    private String titulo;
    private String descripcion;
    private String prioridad;
    private String estado;
    private LocalDateTime fecha_creacion;

    @ManyToOne
    @JoinColumn(name = "fk_usuario") 
    private Usuario usuario;

    @OneToMany(mappedBy = "incidencia")
    private List<Comentario> comentarios;
    
    public long getId_incidencia() {
        return id_incidencia;
    }
    public void setId_incidencia(long id_incidencia) {
        this.id_incidencia = id_incidencia;
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
    public LocalDateTime getFecha_creacion() {
        return fecha_creacion;
    }
    public void setFecha_creacion(LocalDateTime fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }
}
