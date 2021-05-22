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
@Table(name="mesociclo")
public class Mesociclo implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_mesociclo;
	
	@ManyToOne
	@JoinColumn(name="id_tipo")
	private TipoMesociclo tipomesociclo;
	
	@ManyToOne
	@JoinColumn(name="id_estadomesociclo")
	private EstadoMesociclo estadomesociclo;
	
	@ManyToOne
	@JoinColumn(name="id_planentrenamiento")
	private PlanEntrenamiento planentrenamiento;

	public Long getId_mesociclo() {
		return id_mesociclo;
	}

	public void setId_mesociclo(Long id_mesociclo) {
		this.id_mesociclo = id_mesociclo;
	}

	public TipoMesociclo getTipomesociclo() {
		return tipomesociclo;
	}

	public void setTipomesociclo(TipoMesociclo tipomesociclo) {
		this.tipomesociclo = tipomesociclo;
	}

	public EstadoMesociclo getEstadomesociclo() {
		return estadomesociclo;
	}

	public void setEstadomesociclo(EstadoMesociclo estadomesociclo) {
		this.estadomesociclo = estadomesociclo;
	}

	public PlanEntrenamiento getPlanEntrenamiento() {
		return planentrenamiento;
	}

	public void setPlanEntrenamiento(PlanEntrenamiento planEntrenamiento) {
		this.planentrenamiento = planEntrenamiento;
	}

	@Override
	public String toString() {
		return "Mesociclo [id_mesociclo=" + id_mesociclo + ", tipomesociclo=" + tipomesociclo + ", estadomesociclo="
				+ estadomesociclo + ", microciclo=" + planentrenamiento + "]";
	}

	
	
	
	
	
}
