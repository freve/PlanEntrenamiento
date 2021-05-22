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
@Table(name="microciclo")
public class Microciclo implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_microciclo;
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name="id_estadomicrociclo")
	private EstadoMicrociclo estadomicrociclo;
	
	@ManyToOne
	@JoinColumn(name="id_mesociclo")
	private Mesociclo mesociclo;

	public Long getId_microciclo() {
		return id_microciclo;
	}

	public void setId_microciclo(Long id_microciclo) {
		this.id_microciclo = id_microciclo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public EstadoMicrociclo getEstadomicrociclo() {
		return estadomicrociclo;
	}

	public void setEstadomicrociclo(EstadoMicrociclo estadomicrociclo) {
		this.estadomicrociclo = estadomicrociclo;
	}

	public Mesociclo getMesociclo() {
		return mesociclo;
	}

	public void setMesociclo(Mesociclo mesociclo) {
		this.mesociclo = mesociclo;
	}

	@Override
	public String toString() {
		return "Microciclo [id_microciclo=" + id_microciclo + ", nombre=" + nombre + ", estadomicrociclo="
				+ estadomicrociclo + ", sesionentrenamiento=" + mesociclo + "]";
	}
	
	
	
	
	
}
