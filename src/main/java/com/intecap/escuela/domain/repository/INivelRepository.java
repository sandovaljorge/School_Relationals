package com.intecap.escuela.domain.repository;

import com.intecap.escuela.domain.entities.NivelEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface INivelRepository extends JpaRepository<NivelEntity, Integer> {
}
