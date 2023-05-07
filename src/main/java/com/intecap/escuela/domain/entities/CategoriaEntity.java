package com.intecap.escuela.domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Set;


@Entity(name = "categoria")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name = "category")
public class CategoriaEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria", nullable = false,unique = true)
    private int id;
    @Column(name = "nombre_categoria",columnDefinition = "VARCHAR(120)")
    private String nombreCategoria;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            orphanRemoval = true,
            mappedBy = "categoria"
    )
    private Set<CursoEntity> cursos;
}
