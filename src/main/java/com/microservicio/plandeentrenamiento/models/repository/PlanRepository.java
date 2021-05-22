package com.microservicio.plandeentrenamiento.models.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.microservicio.plandeentrenamiento.models.entity.PlanEntrenamiento;

@Repository
public interface PlanRepository extends CrudRepository<PlanEntrenamiento, Long> {

}
