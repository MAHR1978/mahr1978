package springFinalm5.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import springFinalm5.model.DAO.IAsesoriaDAO;

public class AsesoriasDAOImpl implements IAsesoriaDAO{
	private Connection cn  = null;
	@Override
	public void create(Asesoria as) {
		// TODO Auto-generated method stub
		String sql="insert into asesorias(nombre,detalle,profesional_id) values('"+as.getNombre()+"','"+as.getDetalle()+"','"+as.getProfesionalId()+"')";
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
	public List<Asesoria> readAll() {
		// TODO Auto-generated method stub
		String sql="select id,nombre,detalle,profesional_id from asesorias";
		ArrayList<Asesoria> ass = new ArrayList<Asesoria>();
		try {
			cn = ConnectDB.getConn();
			Statement stm = cn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while(rs.next()) {				
				ass.add(new Asesoria(rs.getInt("id"),
						rs.getString("nombre"),
						rs.getString("detalle"),
						rs.getInt("profesional_id")));
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return ass;
	}

	@Override
	public Asesoria readOne(int id) {
		// TODO Auto-generated method stub
		String sql="select id,nombre,detalle,profesional_id from asesorias where id="+id;
		Asesoria as=null;
		try {
			cn = ConnectDB.getConn();
			Statement stm = cn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			if(rs.next()) {
				as = new Asesoria(rs.getInt("id"),
						rs.getString("nombre"),
						rs.getString("detalle"),
						rs.getInt("profesional_id"));
					
			}
		}catch(SQLException e) {
			e.printStackTrace();
			
		}
		return as;
	}

	@Override
	public void update(Asesoria as) {
		// TODO Auto-generated method stub
		String sql="update asesorias set nombre='"+as.getNombre()+"',detalle='"+as.getDetalle()+"'";
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
		String sql="delete form asesorias where id="+id;
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
	public void delete(Asesoria as) {
		// TODO Auto-generated method stub
		delete(as.getId());
	}

}
