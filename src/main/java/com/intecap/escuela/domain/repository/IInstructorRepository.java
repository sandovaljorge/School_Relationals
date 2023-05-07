package com.intecap.escuela.domain.repository;

import com.intecap.escuela.domain.entities.InstructorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IInstructorRepository extends JpaRepository<InstructorEntity, Integer> {
}
