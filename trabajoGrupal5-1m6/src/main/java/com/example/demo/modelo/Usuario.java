package com.example.demo.modelo;

public class Usuario {
	int id;
	String nombre;
	String tipo;
	String rut;
	public Usuario() {
		super();
	}
	public Usuario(int id, String nombre, String tipo, String rut) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.rut = rut;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", tipo=" + tipo + ", rut=" + rut + "]";
	}
	
}
