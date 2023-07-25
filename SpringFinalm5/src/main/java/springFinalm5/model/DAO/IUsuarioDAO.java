package springFinalm5.model.DAO;

import java.util.List;

import springFinalm5.model.Usuario;

public interface IUsuarioDAO {
	public void create(Usuario u);
	public List<Usuario> readAll();
	public Usuario readOne(int id);
	public void update(Usuario u);
	public void delete(int id);
	public void delete(Usuario c);
	
	
}
