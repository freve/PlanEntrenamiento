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
@Table(name="sesionentrenamiento")
public class SesionEntrenamiento implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_sesionentrenamiento;
	private String nombre;
	private String descripcion;
	
	@ManyToOne
	@JoinColumn(name="id_microciclo")
	private Microciclo microciclo;
	
	public Long getId_sesionentrenamiento() {
		return id_sesionentrenamiento;
	}
	public void setId_sesionentrenamiento(Long id_sesionentrenamiento) {
		this.id_sesionentrenamiento = id_sesionentrenamiento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "SesionEntrenamiento [id_sesionentrenamiento=" + id_sesionentrenamiento + ", nombre=" + nombre
				+ ", descripcion=" + descripcion + "]";
	}
	public Microciclo getMicrociclo() {
		return microciclo;
	}
	public void setMicrociclo(Microciclo microciclo) {
		this.microciclo = microciclo;
	}
	
	
}
