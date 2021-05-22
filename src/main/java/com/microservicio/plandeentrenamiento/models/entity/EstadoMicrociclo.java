package com.microservicio.plandeentrenamiento.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="estadomicrociclo")
public class EstadoMicrociclo implements Serializable {
 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_estadomicrociclo;
	private String descripcion;
	public Long getId_estadomicrociclo() {
		return id_estadomicrociclo;
	}
	public void setId_estadomicrociclo(Long id_estadomicrociclo) {
		this.id_estadomicrociclo = id_estadomicrociclo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "EstadoMicrociclo [id_estadomicrociclo=" + id_estadomicrociclo + ", descripcion=" + descripcion + "]";
	}
	
	
	
}
