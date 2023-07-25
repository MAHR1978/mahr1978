package grupal6m5.interfaces;

import java.util.List;

import grupal6m5.model.Capacitaciones;

public interface ICapacitacionDAO {
	public void create(Capacitaciones c);
	public List<Capacitaciones> readAll();
	public Capacitaciones readOne(int id);
	public void update(Capacitaciones u);
	public void delete(int id);
	public void delete(Capacitaciones c);
	
}
