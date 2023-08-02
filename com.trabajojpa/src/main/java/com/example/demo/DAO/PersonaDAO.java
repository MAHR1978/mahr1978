package com.example.demo.DAO;

import java.util.List;
import java.util.Optional;
import com.example.demo.modelo.Persona;

public interface PersonaDAO {	
	
	
	
	List<Persona> findAll();
	
	Optional<Persona> findById(long id);
	long deletePersona(long id_p);
	long updatePersona(long id, Persona persona);
	
}
