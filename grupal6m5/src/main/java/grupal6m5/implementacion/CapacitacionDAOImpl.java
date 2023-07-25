package grupal6m5.implementacion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import grupal6m5.interfaces.ICapacitacionDAO;
import grupal6m5.model.Capacitaciones;
import grupal6m5.model.ConnectDB;

public class CapacitacionDAOImpl implements ICapacitacionDAO{
	private Connection cn  = null;
	@Override
	public void create(Capacitaciones c) {
		// TODO Auto-generated method stub
		String sql ="insert into capacitaciones(id,nombre,detalle) value('"+c.getId()+"','"+c.getNombre()+"','"+c.getDetalle()+"')";
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
	public List<Capacitaciones> readAll() {
		// TODO Auto-generated method stub
		String sql="select id,nombre,detalle from capacitaciones";
		ArrayList<Capacitaciones> cap= new ArrayList<Capacitaciones>();
		try {
			cn = ConnectDB.getConn();
			Statement stm = cn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while(rs.next()) {				
				cap.add(new Capacitaciones(rs.getInt("id"),
						rs.getString("nombre"),
						rs.getString("detalle")));
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return cap;
	}

	@Override
	public Capacitaciones readOne(int id) {
		// TODO Auto-generated method stub
		String sql="select id,nombre,detalle from capacitaciones where id="+id;
		Capacitaciones c=null;
		try {
			cn = ConnectDB.getConn();
			Statement stm = cn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			if(rs.next()) {
					c = new Capacitaciones(rs.getInt("id"),
						rs.getString("nombre"),
						rs.getString("detalle"));
					
			}
		}catch(SQLException e) {
			e.printStackTrace();
			
		}
		return c;
	}

	@Override
	public void update(Capacitaciones c) {
		// TODO Auto-generated method stub
		String sql="update capacitaciones set nombre='"+c.getNombre()+"','"+c.getDetalle()+"' ";
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
		String sql="delete capacitaciones where id="+id;
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
	public void delete(Capacitaciones c) {
		// TODO Auto-generated method stub
		
	}
}
