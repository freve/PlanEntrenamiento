package com.microservicio.plandeentrenamiento.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="equipoplan")
public class EquipoPlan implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_equipoplan;
	
	@ManyToOne
	@JoinColumn(name="id_equipo")
	private Equipo equipo;
	
	@ManyToOne
	@JoinColumn(name="id_planentrenamiento")
	private PlanEntrenamiento planentrenamiento;

	public Long getId_equipoplan() {
		return id_equipoplan;
	}

	public void setId_equipoplan(Long id_equipoplan) {
		this.id_equipoplan = id_equipoplan;
	}

	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	public PlanEntrenamiento getPlanentrenamiento() {
		return planentrenamiento;
	}

	public void setPlanentrenamiento(PlanEntrenamiento planentrenamiento) {
		this.planentrenamiento = planentrenamiento;
	}

	@Override
	public String toString() {
		return "EquipoPlan [id_equipoplan=" + id_equipoplan + ", equipo=" + equipo + ", planentrenamiento="
				+ planentrenamiento + "]";
	}
	
	
	
	
}
