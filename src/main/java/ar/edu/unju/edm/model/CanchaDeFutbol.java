package ar.edu.unju.edm.model;


import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;

@Component
@Entity
public class CanchaDeFutbol {
	@Id
	private String codigo;
	private Double precio;
	private String horario1;
	private String horario2;
	private String horario3;
	
	@Enumerated(EnumType.STRING)
	private CapacidadCancha capacidad;

	public CanchaDeFutbol(String codigo, Double precio, String horario1, String horario2, String horario3,
			CapacidadCancha capacidad) {
		super();
		this.codigo = codigo;
		this.precio = precio;
		this.horario1 = horario1;
		this.horario2 = horario2;
		this.horario3 = horario3;
		this.capacidad = capacidad;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getHorario1() {
		return horario1;
	}

	public void setHorario1(String horario1) {
		this.horario1 = horario1;
	}

	public String getHorario2() {
		return horario2;
	}

	public void setHorario2(String horario2) {
		this.horario2 = horario2;
	}

	public String getHorario3() {
		return horario3;
	}

	public void setHorario3(String horario3) {
		this.horario3 = horario3;
	}

	public CapacidadCancha getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(CapacidadCancha capacidad) {
		this.capacidad = capacidad;
	}
	
	
	
}
