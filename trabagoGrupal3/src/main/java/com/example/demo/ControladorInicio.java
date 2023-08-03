package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorInicio {
	@GetMapping("/")
	public String incio() {
		
		//var personas = personaService.listarPersonas();
		//model.addAttribute("personas", personas);
		return "index";
	}
}
