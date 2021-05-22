package com.microservicio.plandeentrenamiento.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="planentrenamiento")
public class PlanEntrenamiento implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_planentrenamiento;
	private Date fechainicio;
	private Date fechafin;
	private String observaciones;
	private String descripcion;
	
	@ManyToOne
	@JoinColumn(name="id_mesociclo")
	private Mesociclo mesociclo;

	public Long getId_planentrenamiento() {
		return id_planentrenamiento;
	}

	public void setId_planentrenamiento(Long id_planentrenamiento) {
		this.id_planentrenamiento = id_planentrenamiento;
	}

	public Date getFechainicio() {
		return fechainicio;
	}

	public void setFechainicio(Date fechainicio) {
		this.fechainicio = fechainicio;
	}

	public Date getFechafin() {
		return fechafin;
	}

	public void setFechafin(Date fechafin) {
		this.fechafin = fechafin;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	

	public void setMesociclo(Mesociclo mesociclo) {
		this.mesociclo = mesociclo;
	}

	@Override
	public String toString() {
		return "Planentrenamiento [id_planentrenamiento=" + id_planentrenamiento + ", fechainicio=" + fechainicio
				+ ", fechafin=" + fechafin + ", observaciones=" + observaciones + ", descripcion=" + descripcion+ "]";
	}

	
	
}
