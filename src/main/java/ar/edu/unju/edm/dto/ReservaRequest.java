package ar.edu.unju.edm.dto;

import java.time.LocalDate;

public class ReservaRequest {
	private String dniUsuario;
	private String codigoCancha;
	private LocalDate fecha;
	private String horario;
	
	
	public String getDniUsuario() {
		return dniUsuario;
	}
	public void setDniUsuario(String dniUsuario) {
		this.dniUsuario = dniUsuario;
	}
	public String getCodigoCancha() {
		return codigoCancha;
	}
	public void setCodigoCancha(String codigoCancha) {
		this.codigoCancha = codigoCancha;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	
}
