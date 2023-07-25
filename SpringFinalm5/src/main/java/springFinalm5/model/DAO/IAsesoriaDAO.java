package springFinalm5.model.DAO;

import java.util.List;

import springFinalm5.model.Asesoria;



public interface IAsesoriaDAO {
	public void create(Asesoria as);
	public List<Asesoria> readAll();
	public Asesoria readOne(int id);
	public void update(Asesoria as);
	public void delete(int id);
	public void delete(Asesoria as);
}
