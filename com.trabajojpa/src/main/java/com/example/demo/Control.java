package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DAO.PersonaDAO;
import com.example.demo.modelo.Persona;

@RestController
@RequestMapping("api/pers")
public class Control {
	private final PersonaDAO personaDAO;
	
	public Control(PersonaDAO personaDAO) {
		this.personaDAO=personaDAO;
		
	}
	@GetMapping("/all")
	public List<Persona> findAll(){
		return personaDAO.findAll();
	}
	

}
