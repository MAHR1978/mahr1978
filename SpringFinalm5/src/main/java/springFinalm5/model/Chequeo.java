package springFinalm5.model;

public class Chequeo {
	int id;
	int visitaId;
	String detalle;
	String estado;
	public Chequeo() {
		super();
	}
	public Chequeo(int id, int visitaId, String detalle, String estado) {
		super();
		this.id = id;
		this.visitaId = visitaId;
		this.detalle = detalle;
		this.estado = estado;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getVisitaId() {
		return visitaId;
	}
	public void setVisitaId(int visitaId) {
		this.visitaId = visitaId;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	@Override
	public String toString() {
		return "Chequeo [id=" + id + ", visitaId=" + visitaId + ", detalle=" + detalle + ", estado=" + estado + "]";
	}
	
}
