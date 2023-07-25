package springFinalm5.model.DAO;

import java.util.List;

import springFinalm5.model.Chequeo;




public interface IChequeoDAO {
	public void create(Chequeo u);
	public List<Chequeo> readAll();
	public Chequeo readOne(int id);
	public void update(Chequeo u);
	public void delete(int id);
	public void delete(Chequeo c);
}
