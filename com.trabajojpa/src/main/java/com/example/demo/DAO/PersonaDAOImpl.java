package com.example.demo.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Persona;
import com.example.demo.modelo.PersonaRowMapper;
@Repository
public class PersonaDAOImpl implements PersonaDAO{
	
	private final JdbcTemplate jdbcTemplate;
	
	@Autowired
	public PersonaDAOImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
	}
	

	@Override
	public List<Persona> findAll() {
		String sql="""
					Select id_p,nombre,apellido,email
				 	from persona """;
		return jdbcTemplate.query(sql, new PersonaRowMapper());
	}

	@Override
	public Optional<Persona> findById(long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public long deletePersona(long id_p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long updatePersona(long id, Persona persona) {
		String sql="""
				update persona set nombre =?,apellido=?,email=?
				where id_p=?
				""";
		return jdbcTemplate.update(sql,
				persona.getNombre(),
				persona.getApellido(),
				persona.getEmail());
			
	}

}
