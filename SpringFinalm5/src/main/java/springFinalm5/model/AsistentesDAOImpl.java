package springFinalm5.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import springFinalm5.model.DAO.IAsistenteDAO;



public class AsistentesDAOImpl implements IAsistenteDAO{
	private Connection cn  = null;

	@Override
	public void create(Asistentes a) {
		// TODO Auto-generated method stub
		String sql="insert into asistentes(capacitacion_id,usuario_id) values('"+a.getCapacitacionID()+"','"+a.getusuarioID()+"')";
		System.out.println(sql);
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
	public List<Asistentes> readAll() {
		// TODO Auto-generated method stub
		String sql="select capacitacion_id,usuario_id from asistentes";
		ArrayList<Asistentes> aSE = new ArrayList<Asistentes>();
		try {
			cn = ConnectDB.getConn();
			Statement stm = cn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while(rs.next()) {				
				aSE.add(new Asistentes(rs.getInt("capacitacion_id"),
						rs.getInt("usuario_id")));
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return aSE;
	}

	@Override
	public Asistentes readOne(int id) {
		// TODO Auto-generated method stub
		String sql="select capacitacion_id,usuario_id from asistentes where capacitacion_id="+id;
		Asistentes a=null;
		try {
			cn = ConnectDB.getConn();
			Statement stm = cn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			if(rs.next()) {
				a = new Asistentes(rs.getInt("capacitacion_id"),
						rs.getInt("usuario_id"));
					
			}
		}catch(SQLException e) {
			e.printStackTrace();
			
		}
		return a;
	}

	@Override
	public void update(Asistentes a) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		String sql="delete from asistentes where capacitacionid="+id;
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
	public void delete(Asistentes a) {
		// TODO Auto-generated method stub
		delete(a.getCapacitacionID());
	}

	

}
