package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="persona")

public class Persona implements Serializable{
	private static final long serialVersionUID= 1L;
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id_p;
		private String nombre;
		private String apellido;
		private String email;
		public Persona() {
			super();
		}
		public Persona(Long id_p, String nombre, String apellido, String email) {
			super();
			this.id_p = id_p;
			this.nombre = nombre;
			this.apellido = apellido;
			this.email = email;
		}
		public Long getId_p() {
			return id_p;
		}
		public void setId_p(Long id_p) {
			this.id_p = id_p;
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
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		@Override
		public String toString() {
			return "Persona [id_p=" + id_p + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + "]";
		}
		
		
}
