package com.intecap.escuela.domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity(name = "inscripcion")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name = "inscription")
public class InscripcionEntity implements Serializable {

    @EmbeddedId
    private InscripcionKey id;

    @ManyToOne
    @MapsId("estudianteId")
    @JoinColumn(name = "estudiante_id")
    private EstudianteEntity estudiante;

    @ManyToOne
    @MapsId("cursoId")
    @JoinColumn(name = "curso_id")
    private CursoEntity curso;
    @Column(name = "precio_pagado",columnDefinition = "DECIMAL(10,2)")
    private BigDecimal precioPagado;


}
