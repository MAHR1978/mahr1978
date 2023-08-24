package com.example.demo.modelo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UsuarioRowMapper implements RowMapper<Usuario>{

	@Override
	public Usuario mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		return new Usuario(
				rs.getInt("id"),
				rs.getString("nombre"),
				rs.getString("tipo"),
				rs.getString("rut"));
	}
	

}