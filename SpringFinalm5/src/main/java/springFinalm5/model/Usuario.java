package springFinalm5.model;

public class Usuario {
	int id;
	String nombre;
	String tipo;
	
	public Usuario() {
		super();
	}
	public Usuario(int id,  String nombre, String tipo) {
		super();
		this.id = id;
		
		this.nombre = nombre;
		this.tipo = tipo;
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
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", tipo=" + tipo + "]";
	}
	
}
