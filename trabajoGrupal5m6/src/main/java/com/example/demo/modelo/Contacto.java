package com.example.demo.modelo;

public class Contacto {
		int id;
		String nombre;
		String apellido;
		String telefono;
		String email;
		String mensaje;
		public Contacto() {
			super();
		}
		public Contacto(int id, String nombre, String apellido, String telefono, String email, String mensaje) {
			super();
			this.id = id;
			this.nombre = nombre;
			this.apellido = apellido;
			this.telefono = telefono;
			this.email = email;
			this.mensaje = mensaje;
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
		public String getApellido() {
			return apellido;
		}
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
		public String getTelefono() {
			return telefono;
		}
		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getMensaje() {
			return mensaje;
		}
		public void setMensaje(String mensaje) {
			this.mensaje = mensaje;
		}
		@Override
		public String toString() {
			return "Contacto [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono
					+ ", email=" + email + ", mensaje=" + mensaje + "]";
		}
		
		
		
}



