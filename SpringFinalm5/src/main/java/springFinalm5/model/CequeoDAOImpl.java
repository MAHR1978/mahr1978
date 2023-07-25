package springFinalm5.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import springFinalm5.model.DAO.IChequeoDAO;


public class CequeoDAOImpl implements IChequeoDAO{
	private Connection cn  = null;
	@Override
	public void create(Chequeo u) {
		// TODO Auto-generated method stub
		String sql="insert into chequeos(visita_id,detalle,estado) values('"+u.getVisitaId()+"','"+u.getDetalle()+"','"+u.getEstado()+"')";
		
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
	public List<Chequeo> readAll() {
		// TODO Auto-generated method stub
		String sql="select id,visita_id,detalle,estado from chequeos";
		ArrayList<Chequeo> che = new ArrayList<Chequeo>();
		try {
			cn = ConnectDB.getConn();
			Statement stm = cn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while(rs.next()) {				
				che.add(new Chequeo(rs.getInt("id"),
						rs.getInt("visita_id"),
						rs.getString("detalle"),
						rs.getString("estado")));
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return che;
	}

	@Override
	public Chequeo readOne(int id) {
		// TODO Auto-generated method stub
		String sql="select id,visita_id,detalle,estado from chequeos where id="+id;
		Chequeo che=null;
		try {
			cn = ConnectDB.getConn();
			Statement stm = cn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			if(rs.next()) {
				che = new Chequeo(rs.getInt("id"),
						rs.getInt("visita_id"),
						rs.getString("detalle"),
						rs.getString("estado"));
					
			}
		}catch(SQLException e) {
			e.printStackTrace();
			
		}
		return che;
	}

	@Override
	public void update(Chequeo u) {
		// TODO Auto-generated method stub
		String sql="update chequeos set visita_id='"+u.getVisitaId()+"','"+u.getDetalle()+"','"+u.getEstado()+"'";
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
		String sql="delete from chequeos where id="+id;
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
	public void delete(Chequeo c) {
		// TODO Auto-generated method stub
		delete(c.getId());
	}

}
