package springFinalm5.model.DAO;

import java.util.List;

import springFinalm5.model.Asistentes;

public interface IAsistenteDAO {
	public void create(Asistentes a);
	public List<Asistentes> readAll();
	public Asistentes readOne(int id);
	public void update(Asistentes a);
	public void delete(int id);
	public void delete(Asistentes a);
}
