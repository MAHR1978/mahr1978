package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class ControladorContacto {

	@GetMapping("/contacto")
	public String contacto() {
		
		return "contacto";
	}
	
	
}
