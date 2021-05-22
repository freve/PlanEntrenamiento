package com.microservicio.plandeentrenamiento.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservicio.plandeentrenamiento.models.entity.Microciclo;
import com.microservicio.plandeentrenamiento.models.repository.MicrocicloRepository;

@Service
public class MicrocicloServiceImp implements IMicrocicloServices {

	@Autowired /* declaracion de dependencia */
 	private MicrocicloRepository microcicloRepository;
	
	@Override
	public List<Microciclo> ListarTodos() {
		return (List<Microciclo>) microcicloRepository.findAll();
	}

	@Override
	public void guardar(Microciclo Microciclo) {
		microcicloRepository.save(Microciclo);

	}

	@Override
	public Microciclo buscarporId(Long Microciclo) {
		
		return microcicloRepository.findById(Microciclo).orElse(null);
	}

	@Override
	public void eliminar(Long id_microciclo) {
		microcicloRepository.deleteById(id_microciclo);
	}

}
