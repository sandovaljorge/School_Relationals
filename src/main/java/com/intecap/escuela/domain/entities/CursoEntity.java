package com.intecap.escuela.domain.entities;

import com.intecap.escuela.utils.Certificado;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.Set;

@Entity(name = "curso")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name = "course")
public class CursoEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_curso", nullable = false,unique = true)
    private int id;
    @Column(length = 60)
    private String titulo;
    @Column(length = 100)
    private String subtitutlo;
    @Column(length = 255)
    private String descripcion;
    @Column(length = 255)
    private String imagen;
    @Column(length = 255)
    private String video;
    @Column(name = "horas_video",columnDefinition = "FLOAT")
    private Integer horasVideo;
    @Column(name = "cantidad_recursos",columnDefinition = "TINYINT")
    private Integer cantidadRecursos;
    @Column(columnDefinition = "DECIMAL(10,2)")
    private BigDecimal precio;
    @Enumerated(EnumType.STRING)
    private Certificado certificado;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            orphanRemoval = true,
            mappedBy = "curso"
    )
    private Set<InscripcionEntity> inscripciones;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private CategoriaEntity categoria;

    @ManyToOne
    @JoinColumn(name = "instructor_id")
    private InstructorEntity instructor;

    //Relacion Uno a Uno
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(
            name = "nivel_id",
            unique = true,
            nullable = false,
            referencedColumnName = "id_nivel"
    )
    private NivelEntity nivel;

}
