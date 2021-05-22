package com.microservicio.plandeentrenamiento.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;



import com.microservicio.plandeentrenamiento.models.entity.PlanEntrenamiento;

import com.microservicio.plandeentrenamiento.models.repository.PlanRepository;

@Controller
@RequestMapping("/planesentrenamiento")
public class PlanEntControllerV {
	@Autowired
	private PlanRepository planRepository;

	@GetMapping(value="listar")
	public String listarEquipos(Model model) {
		List<PlanEntrenamiento> listadoplanes = (List<PlanEntrenamiento>) planRepository.findAll();

		model.addAttribute("titulo", "Lista de Planes de entrenamiento");
		model.addAttribute("planes", listadoplanes);

		return "/views/planes/listar";
	}
	
	@GetMapping(value="{id_planentrenamiento}")
	public String buscarMesocicloByPlan(Model model,@PathVariable("id_planentrenamiento") Long id_planentrenamiento) {
		
		Optional <PlanEntrenamiento> optionalPlan = planRepository.findById(id_planentrenamiento);

		model.addAttribute("titulo", "Lista de Planes de entrenamiento");
		model.addAttribute("planes", optionalPlan.get());

		return "/views/mesociclos/listarByP";
	}
}
