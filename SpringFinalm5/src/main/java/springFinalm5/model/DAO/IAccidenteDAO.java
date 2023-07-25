package springFinalm5.model.DAO;

import java.util.List;

import springFinalm5.model.Accidentes;

public interface IAccidenteDAO {
	public void create(Accidentes a);
	public List<Accidentes> readAll();
	public Accidentes readOne(int id);
	public void update(Accidentes a);
	public void delete(int id);
	public void delete(Accidentes a);
}
