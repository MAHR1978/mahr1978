package com.example.demo.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Capacitacion;
import com.example.demo.modelo.CapacitacionRowMapper;
@Repository
public class CapacitacionDAOImpl implements CapacitacionDAO{
	private final JdbcTemplate jdbcTemplate;
	
	@Autowired
	public CapacitacionDAOImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
	}

	@Override
	public List<Capacitacion> findAll() {
		String sql="""
				Select id,nombre,detalle,cantidad_participantes,lugar_capacitacion
			 	from capacitaciones """;
				return jdbcTemplate.query(sql, new CapacitacionRowMapper());
		
	}

	@Override
	public Optional<Capacitacion> findById(long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public long deleteCapacitacion(long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long updateCapacitacion(long id, Capacitacion capacitacion) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long addCapacitacion(Capacitacion capacitacion) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
