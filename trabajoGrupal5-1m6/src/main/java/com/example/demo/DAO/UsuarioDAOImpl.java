package com.example.demo.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.modelo.UsuarioRowMapper;
import com.example.demo.modelo.Usuario;



@Repository
public class UsuarioDAOImpl implements UsuariosDAO{
	
	private final JdbcTemplate jdbcTemplate;
	
	@Autowired
	public UsuarioDAOImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
	}
	
	@Override
	public List<Usuario> findAll() {
		String sql ="""
				select id,nombre,tipo,rut 
				from usuarios
				""";
		return jdbcTemplate.query(sql, new UsuarioRowMapper());
	}

	@Override
	public Optional<Usuario> finfById() {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public long deleteUsuario(long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long updateUsuario(long id, Usuario usuario) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long addUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return 0;
	}

}
