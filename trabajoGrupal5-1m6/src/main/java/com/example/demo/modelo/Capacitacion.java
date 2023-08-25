package com.example.demo.modelo;

public class Capacitacion {
	int id;
	String nombre;	
	int cantidad_participantes;
	String lugar_capacitacion;
	String nombre_capacitacion;
	public Capacitacion() {
		super();
	}
	public Capacitacion(int id, String nombre, int cantidad_participantes, String lugar_capacitacion,
			String nombre_capacitacion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cantidad_participantes = cantidad_participantes;
		this.lugar_capacitacion = lugar_capacitacion;
		this.nombre_capacitacion = nombre_capacitacion;
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
	public int getCantidad_participantes() {
		return cantidad_participantes;
	}
	public void setCantidad_participantes(int cantidad_participantes) {
		this.cantidad_participantes = cantidad_participantes;
	}
	public String getLugar_capacitacion() {
		return lugar_capacitacion;
	}
	public void setLugar_capacitacion(String lugar_capacitacion) {
		this.lugar_capacitacion = lugar_capacitacion;
	}
	public String getNombre_capacitacion() {
		return nombre_capacitacion;
	}
	public void setNombre_capacitacion(String nombre_capacitacion) {
		this.nombre_capacitacion = nombre_capacitacion;
	}
	@Override
	public String toString() {
		return "Capacitacion [id=" + id + ", nombre=" + nombre + ", cantidad_participantes=" + cantidad_participantes
				+ ", lugar_capacitacion=" + lugar_capacitacion + ", nombre_capacitacion=" + nombre_capacitacion + "]";
	}

	
	
	
	
	
	
}
