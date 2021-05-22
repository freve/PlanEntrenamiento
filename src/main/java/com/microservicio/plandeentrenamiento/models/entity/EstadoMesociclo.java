package com.microservicio.plandeentrenamiento.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="estadomesociclo")
public class EstadoMesociclo implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_estadomesociclo;
	private String descripcion;
	
	public Long getId_estadomesociclo() {
		return id_estadomesociclo;
	}
	public void setId_estadomesociclo(Long id_estadomesociclo) {
		this.id_estadomesociclo = id_estadomesociclo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "EstadoMesociclo [id_estado=" + id_estadomesociclo + ", descripcion=" + descripcion + "]";
	}
	
	
}
