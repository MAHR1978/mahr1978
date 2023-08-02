package com.example.demo.modelo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class PersonaRowMapper implements RowMapper<Persona>{

	@Override
	public Persona mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		return new Persona(
				rs.getLong("id_p"),
				rs.getString("nombre"),
				rs.getString("apellido"),
				rs.getString("email")
				);
	}

	
}
