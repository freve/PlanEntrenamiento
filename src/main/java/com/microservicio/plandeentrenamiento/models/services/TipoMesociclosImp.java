package com.microservicio.plandeentrenamiento.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.microservicio.plandeentrenamiento.models.entity.TipoMesociclo;
import com.microservicio.plandeentrenamiento.models.repository.TipoMesocicloRepository;

public class TipoMesociclosImp implements ITipoMesocicloServices {

	@Autowired /* declaracion de dependencia */
 	private TipoMesocicloRepository tipoMesocicloRepository;
	
	@Override
	public List<TipoMesociclo> ListarTodos() {
		return (List<TipoMesociclo>) tipoMesocicloRepository.findAll();
	}

	@Override
	public void guardar(TipoMesociclo tipoMesociclo) {
		tipoMesocicloRepository.save(tipoMesociclo);

	}

	@Override
	public TipoMesociclo buscarporId(Long id_tipoMesociclo) {
		return tipoMesocicloRepository.findById(id_tipoMesociclo).orElse(null);
	}

	@Override
	public void eliminar(Long id_tipoMesociclo) {
		tipoMesocicloRepository.deleteById(id_tipoMesociclo);

	}

}
