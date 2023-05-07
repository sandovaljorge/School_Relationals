package com.intecap.escuela.domain.repository;

import com.intecap.escuela.domain.entities.InscripcionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IInscripcionRepository extends JpaRepository<InscripcionEntity, Integer> {
        }
