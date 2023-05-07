package com.intecap.escuela.domain.repository;

import com.intecap.escuela.domain.entities.CategoriaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoriaRepository extends JpaRepository<CategoriaEntity, Integer> {
}
