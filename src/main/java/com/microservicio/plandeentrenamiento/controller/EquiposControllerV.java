package com.microservicio.plandeentrenamiento.controller;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import org.springframework.web.bind.annotation.RequestMapping;


import com.microservicio.plandeentrenamiento.models.entity.Equipo;
import com.microservicio.plandeentrenamiento.models.repository.EquipoRepository;

@Controller
@RequestMapping("/equipos")
public class EquiposControllerV {
	@Autowired
	private EquipoRepository equipoRepository;

	@GetMapping(value="listarequipos")
	public String listarEquipos(Model model) {
		List<Equipo> listadoEquipos = (List<Equipo>) equipoRepository.findAll();

		model.addAttribute("titulo", "Lista de Equipos");
		model.addAttribute("equipos", listadoEquipos);

		return "/views/equipos/listar";
	}
	
}
