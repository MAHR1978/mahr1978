package springFinalm5.model;

import java.util.Date;

public class Accidentes {
	int id;
	int clienteId;
	Date fechaAccidente;
	String detalle;
	public Accidentes() {
		super();
	}
	public Accidentes(int id, int id_cliente, Date fechaAccidente, String detalle) {
		super();
		this.id = id;
		this.clienteId = id_cliente;
		this.fechaAccidente = fechaAccidente;
		this.detalle = detalle;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getclienteId() {
		return clienteId;
	}
	public void setclienteId(int id_cliente) {
		this.clienteId = id_cliente;
	}
	public Date getFechaAccidente() {
		return fechaAccidente;
	}
	public void setFechaAccidente(Date fechaAccidente) {
		this.fechaAccidente = fechaAccidente;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	@Override
	public String toString() {
		return "Accidentes [id=" + id + ", clienteId=" + clienteId + ", fechaAccidente=" + fechaAccidente
				+ ", detalle=" + detalle + "]";
	}
	
}
