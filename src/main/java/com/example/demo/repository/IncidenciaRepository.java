package com.example.demo.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Incidencia;

public interface IncidenciaRepository extends JpaRepository<Incidencia, Long> {

    Long countByUsuarioId(Long id);

    List<Incidencia> findByFechacreacionBetween(LocalDate min, LocalDate max);

}
