package com.example.demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DAO.PersonaDAO;

@RestController
public class Controlador {
	
	private PersonaDAO personaDao;
	
	
	@GetMapping("/")
	public String inicio(Model model) {
	
		//var saludo="hola desde controller"; 
		//var persona = new Persona();
		//persona.setNombre("marco");
		//model.addAttribute("saludo", saludo);
		//model.addAttribute("psp", psp);
		//model.addAttribute("persona", persona);
		var personas = personaDao.findAll();
		model.addAttribute("persona", personas);
		return "index";
		
		
	}
}
