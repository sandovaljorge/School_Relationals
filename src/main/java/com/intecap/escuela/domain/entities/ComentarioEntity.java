package com.intecap.escuela.domain.entities;

import com.intecap.escuela.utils.Puntaje;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Set;

@Entity(name = "comentario")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name = "comment")
public class ComentarioEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_comentario", nullable = false,unique = true)
    private int id;
    @Column(length = 60)
    private String titulo_comentario;
    @Column(length = 120, name = "texto_comentario")
    private String textoComentario;
    @Enumerated(EnumType.ORDINAL)
    private Puntaje puntaje;

    //Relacion ManyToMany
    @ManyToMany
    @JoinTable(
            name = "comments_course",
            joinColumns = @JoinColumn(
                    name = "comentario_id"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "curso_id"
            )
    )
    private Set<CursoEntity> cursos;

}
