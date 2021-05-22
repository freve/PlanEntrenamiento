package com.microservicio.plandeentrenamiento.models.services;

import java.util.List;

import com.microservicio.plandeentrenamiento.models.entity.TipoMesociclo;

public interface ITipoMesocicloServices {
	public List<TipoMesociclo> ListarTodos();
	public void guardar (TipoMesociclo tipoMesociclo);
	public TipoMesociclo buscarporId(Long id_tipoMesociclo);
	public void eliminar(Long id_tipoMesociclo);
}
