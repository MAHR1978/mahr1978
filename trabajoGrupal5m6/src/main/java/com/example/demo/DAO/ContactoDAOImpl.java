package com.example.demo.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Contacto;
import com.example.demo.modelo.ContactoRowMapper;
@Repository
public class ContactoDAOImpl implements ContactoDAO{
	
	private final JdbcTemplate jdbcTemplate;

	@Autowired
	public ContactoDAOImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
	}
	
	
	
	@Override
	public List<Contacto> findAll() {
		String sql="""
				Select id,nombre,apellido,telefono,email,mensaje
			 	from contacto """;
				return jdbcTemplate.query(sql, new ContactoRowMapper());
		
	}

	

	@Override
	public Optional<Contacto> findById(long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public long deleteContacto(long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long updateContacto(long id, Contacto contaco) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long addContacto(Contacto contaco) {
		// TODO Auto-generated method stub
		return 0;
	}

}
