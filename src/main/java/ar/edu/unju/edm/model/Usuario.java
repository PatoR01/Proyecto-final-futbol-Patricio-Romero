package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;

@Component
@Entity
public class Usuario {
		@Id
		private Integer dni;
		
		private String nombre;
		private String apellido;
		
		@Enumerated(EnumType.STRING)
		private TipoUsuario tipo;

		public Usuario(Integer dni, String nombre, String apellido, TipoUsuario tipo) {
			super();
			this.dni = dni;
			this.nombre = nombre;
			this.apellido = apellido;
			this.tipo = tipo;
		}

		public Integer getDni() {
			return dni;
		}

		public void setDni(Integer dni) {
			this.dni = dni;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		public TipoUsuario getTipo() {
			return tipo;
		}

		public void setTipo(TipoUsuario tipo) {
			this.tipo = tipo;
		}
		
		
}

