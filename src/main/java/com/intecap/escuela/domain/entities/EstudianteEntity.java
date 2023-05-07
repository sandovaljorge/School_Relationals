package com.intecap.escuela.domain.entities;

import com.intecap.escuela.utils.Genero;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Set;

@Entity(name = "estudiante")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name = "student")
public class EstudianteEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estudiante", nullable = false,unique = true)
    private int id;
    @Column(length = 120)
    private String nombre;
    @Column(length = 120)
    private String apellido;
    @Column(length = 120)
    private String email;
    private int telefono;
    @Enumerated(EnumType.STRING)
    private Genero genero;
    @Column(length = 255)
    private String direccion;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            orphanRemoval = true,
            mappedBy = "estudiante"
    )
    private Set<InscripcionEntity> inscripciones;

}
