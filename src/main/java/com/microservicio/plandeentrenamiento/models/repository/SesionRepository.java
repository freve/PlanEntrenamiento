package com.microservicio.plandeentrenamiento.models.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.microservicio.plandeentrenamiento.models.entity.SesionEntrenamiento;
@Repository
public interface SesionRepository extends CrudRepository<SesionEntrenamiento, Long> {

}
