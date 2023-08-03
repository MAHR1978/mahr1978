package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class ControladorCrearCapacitacion {
	@GetMapping("/crearCapacitacion")
	public String crearCapacitacion() {
		
		//var personas = personaService.listarPersonas();
		//model.addAttribute("personas", personas);
		return "crearCapacitacion";
	}
}
