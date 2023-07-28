package com.example.demo.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.demo.model.Persona;

@Service
public interface PersonaDAO extends CrudRepository<Persona , Long> {
	
	
}
