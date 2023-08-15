package com.example.demo.modelo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ContactoRowMapper implements RowMapper<Contacto>{

	@Override
	public Contacto mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		return new Contacto(
				rs.getInt("id"),
				rs.getString("nombre"),
				rs.getString("apellido"),
				rs.getString("telefono"),
				rs.getString("email"),
				rs.getString("mensaje"));
	}
	

}
