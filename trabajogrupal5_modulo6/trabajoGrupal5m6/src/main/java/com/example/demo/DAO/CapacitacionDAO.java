package com.example.demo.DAO;

import java.util.List;
import java.util.Optional;

import com.example.demo.modelo.Capacitacion;

public interface CapacitacionDAO {
List<Capacitacion> findAll();
	
	Optional<Capacitacion> findById(long id);
	long deleteCapacitacion(long id);
	long updateCapacitacion(long id, Capacitacion capacitacion);
	long addCapacitacion(Capacitacion capacitacion);
}
