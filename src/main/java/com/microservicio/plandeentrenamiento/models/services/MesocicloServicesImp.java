package com.microservicio.plandeentrenamiento.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservicio.plandeentrenamiento.models.entity.Mesociclo;
import com.microservicio.plandeentrenamiento.models.repository.MesocicloRepository;

@Service
public class MesocicloServicesImp implements IMesocicloServices {

	
	@Autowired /* declaracion de dependencia */
 	private MesocicloRepository mesocicloRepository;
	
	@Override
	public List<Mesociclo> ListarTodos() {
		return (List<Mesociclo>) mesocicloRepository.findAll();
	}

	@Override
	public void guardar(Mesociclo Mesociclo) {
		mesocicloRepository.save(Mesociclo);

	}

	@Override
	public Mesociclo buscarporId(Long Mesociclo) {
		return mesocicloRepository.findById(Mesociclo).orElse(null);
	}

	@Override
	public void eliminar(Long id_mesociclo) {
		mesocicloRepository.deleteById(id_mesociclo);

	}

}
