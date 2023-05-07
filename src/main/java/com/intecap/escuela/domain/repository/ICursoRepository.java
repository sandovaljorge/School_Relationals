package com.intecap.escuela.domain.repository;

import com.intecap.escuela.domain.entities.CursoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICursoRepository extends JpaRepository<CursoEntity, Integer> {
}
