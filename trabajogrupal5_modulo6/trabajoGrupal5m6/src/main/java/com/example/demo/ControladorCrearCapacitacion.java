package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.DAO.CapacitacionDAO;

import com.example.demo.modelo.Capacitacion;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class ControladorCrearCapacitacion {
	
	private final CapacitacionDAO capacitacionDAO;
	
	public ControladorCrearCapacitacion(CapacitacionDAO capacitacionDAO) {
		this.capacitacionDAO=capacitacionDAO;
		
	}
	
	
	
	
	@GetMapping("/crearCapacitacion")
	public String crearCapacitacion() {
		
		//var personas = personaService.listarPersonas();
		//model.addAttribute("personas", personas);
		return "crearCapacitacion";
	}
	@GetMapping("/capacitaciones/all")
	public String findAll(Model model) {
		List<Capacitacion> capacitacion = capacitacionDAO.findAll();
		model.addAttribute("capacitacion", capacitacion);
		return "capacitaciones";
	}
}
