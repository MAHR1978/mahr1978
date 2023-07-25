package springFinalm5.model;

public class Asesoria {
	int id;
	String nombre;
	String detalle;
	int profesionalId;
	public Asesoria() {
		super();
	}
	public Asesoria(int id, String nombre, String detalle, int profesionalId) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.detalle = detalle;
		this.profesionalId = profesionalId;
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
	public int getProfesionalId() {
		return profesionalId;
	}
	public void setProfesionalId(int profesionalId) {
		this.profesionalId = profesionalId;
	}
	@Override
	public String toString() {
		return "Asesoria [id=" + id + ", nombre=" + nombre + ", detalle=" + detalle + ", profesionalId=" + profesionalId
				+ "]";
	}
	
}
