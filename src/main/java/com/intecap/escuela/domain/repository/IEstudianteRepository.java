package com.intecap.escuela.domain.repository;

import com.intecap.escuela.domain.entities.EstudianteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEstudianteRepository extends JpaRepository<EstudianteEntity, Integer> {
}
