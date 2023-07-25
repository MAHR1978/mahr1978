package springFinalm5.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import springFinalm5.model.DAO.IAccidenteDAO;

public class AccidenteDAOImpl implements IAccidenteDAO {
	private Connection cn  = null;
	@Override
	public void create(Accidentes a) {
		// TODO Auto-generated method stub
		String sql="insert into accidentes(cliente_id,fecha_accidente,detalle) values('"+a.getclienteId()+"','"+a.getFechaAccidente()+"','"+a.getDetalle()+"')";
		
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
	public List<Accidentes> readAll() {
		// TODO Auto-generated method stub
		String sql="select id,cliente_id,fecha_accidente,detalle from accidentes";
		ArrayList<Accidentes> acc = new ArrayList<Accidentes>();
		try {
			cn = ConnectDB.getConn();
			Statement stm = cn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while(rs.next()) {				
				acc.add(new Accidentes(rs.getInt("id"),
						rs.getInt("cliente_id"),
						rs.getDate("fecha_accidente"),
						rs.getString("detalle")));
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return acc;
	}

	@Override
	public Accidentes readOne(int id) {
		// TODO Auto-generated method stub
		String sql ="select id,cliente_id,fecha_accidente,detalle from accidentes where id="+id;
		Accidentes ac=null;
		try {
			cn = ConnectDB.getConn();
			Statement stm = cn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			if(rs.next()) {
				ac = new Accidentes(rs.getInt("id"),
						rs.getInt("cliente_id"),
						rs.getDate("fecha_accidente"),
						rs.getString("detalle"));
					
			}
		}catch(SQLException e) {
			e.printStackTrace();
			
		}
		return ac;
	}

	@Override
	public void update(Accidentes a) {
		// TODO Auto-generated method stub
		String sql="update accidentes set fecha_accidente='"+a.getFechaAccidente()+"',detalle='"+a.getDetalle()+"' ";
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
		String sql ="delete from accidentes where id="+id;
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
	public void delete(Accidentes a) {
		// TODO Auto-generated method stub
		delete(a.getId());
	}

}
