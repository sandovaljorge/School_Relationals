package com.intecap.escuela.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Embeddable
public class InscripcionKey implements Serializable {

    @Column(name = "estudiante_id")
    public int estudianteId;
    @Column(name = "curso_id")
    public int cursoId;
}
