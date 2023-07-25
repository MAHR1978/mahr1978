package springFinalm5.model;

public class Asistentes {
	int capacitacionID;
	int usuarioID;
	public Asistentes() {
		super();
	}
	public Asistentes(int capacitacionID, int usuarioID) {
		super();
		this.capacitacionID = capacitacionID;
		this.usuarioID = usuarioID;
	}
	public int getCapacitacionID() {
		return capacitacionID;
	}
	public void setCapacitacionID(int capacitacionID) {
		this.capacitacionID = capacitacionID;
	}
	public int getusuarioID() {
		return usuarioID;
	}
	public void setusuarioID(int usuarioID) {
		this.usuarioID = usuarioID;
	}
	@Override
	public String toString() {
		return "Asistentes [capacitacionID=" + capacitacionID + ", usuarioID=" + usuarioID + "]";
	}
	
	
}
