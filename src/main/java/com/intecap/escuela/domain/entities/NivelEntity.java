package com.intecap.escuela.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity(name = "nivel")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name = "level")
public class NivelEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_nivel", nullable = false,unique = true)
    private int id;
    private String tipo;

    @OneToOne(mappedBy = "nivel")
    private CursoEntity curso;
}
