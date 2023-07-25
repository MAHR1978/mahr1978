package grupal6m5.implementacion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import grupal6m5.model.ConnectDB;
import grupal6m5.model.Usuario;
import grupal6m5.interfaces.ICapacitacionDAO;
import grupal6m5.interfaces.IUsuarioDAO;

public class UsuarioDAOImpl implements IUsuarioDAO{
	private Connection cn  = null;
	
	@Override
	public void create(Usuario u) {
		// TODO Auto-generated method stub
		String sql="insert into usuarios(nombre,tipo) values('"+u.getNombre()+"','"+u.getTipo()+"')";
		
		try{
			cn = ConnectDB.getConn();
			Statement stm = cn.createStatement();
			stm.execute(sql);
			stm.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Usuario> readAll() {
		// TODO Auto-generated method stub
		String sql="select id,nombre,tipo from usuarios";
		ArrayList<Usuario> usu = new ArrayList<Usuario>();
		try {
			cn = ConnectDB.getConn();
			Statement stm = cn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while(rs.next()) {				
				usu.add(new Usuario(rs.getInt("id"),
						rs.getString("nombre"),
						rs.getString("tipo")));
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return usu;
	}

	@Override
	public Usuario readOne(int id) {
		// TODO Auto-generated method stub
		String sql="select id,nombre,tipo from usuarios where id="+id;
		Usuario u =null;
		try {
			cn = ConnectDB.getConn();
			Statement stm = cn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			if(rs.next()) {
					u = new Usuario(rs.getInt("id"),
						
						rs.getString("nombre"),
						rs.getString("tipo"));
					
			}
		}catch(SQLException e) {
			e.printStackTrace();
			
		}
		
		
		return u;
	}

	@Override
	public void update(Usuario u) {
		// TODO Auto-generated method stub
		String sql="update usuarios set nombre='"+u.getNombre()+"'.'"+u.getTipo()+"'";
		try {
			cn = ConnectDB.getConn();
			Statement stm = cn.createStatement();
			stm.execute(sql);
			stm.close();
		}
			catch(SQLException e) {
				e.printStackTrace();
			
		}
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		String sql="delete from usuarios where id="+id;
		try {
			cn = ConnectDB.getConn();
			Statement stm = cn.createStatement();
			stm.execute(sql);
			stm.close();
		}
		catch(SQLException e) 
		{
			e.printStackTrace();
		}
	}

	@Override
	public void delete(Usuario c) {
		// TODO Auto-generated method stub
		delete(c.getId());
	}

}
