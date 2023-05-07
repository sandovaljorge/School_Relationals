package com.intecap.escuela.domain.repository;

import com.intecap.escuela.domain.entities.ComentarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IComentarioRepository extends JpaRepository<ComentarioEntity, Integer> {
}
