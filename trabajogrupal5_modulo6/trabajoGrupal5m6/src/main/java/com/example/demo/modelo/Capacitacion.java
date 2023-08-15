package com.example.demo.modelo;

public class Capacitacion {
	int id;
	String nombre;
	String detalle;
	int cantidad_participantes;
	String lugar_capacitacion;
	public Capacitacion() {
		super();
	}
	public Capacitacion(int id, String nombre, String detalle, int cantidad_participantes, String lugar_capacitacion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.detalle = detalle;
		this.cantidad_participantes = cantidad_participantes;
		this.lugar_capacitacion = lugar_capacitacion;
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
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
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
	@Override
	public String toString() {
		return "Capacitacion [id=" + id + ", nombre=" + nombre + ", detalle=" + detalle + ", cantidad_participantes="
				+ cantidad_participantes + ", lugar_capacitacion=" + lugar_capacitacion + "]";
	}
	
	
	
	
	
	
}
