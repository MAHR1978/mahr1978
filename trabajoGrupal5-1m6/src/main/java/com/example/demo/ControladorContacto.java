package com.example.demo;

import java.util.List;



import com.example.demo.DAO.ContactoDAO;
import com.example.demo.modelo.Contacto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@Controller
public class ControladorContacto {
	
private final ContactoDAO contactoDAO;
	
	@Autowired
	public ControladorContacto(ContactoDAO contactoDAO) {
		this.contactoDAO=contactoDAO;
		
	}

	@GetMapping("/contacto")
	public String contacto() {
		
		return "contacto";
	}
	@GetMapping("/contacto/actualiza")
	public String acttualizaContacto() {
		return "contactupdate";
	}
	
	@GetMapping("/contacto/all")
	public String findAll(Model model) {
		List<Contacto> contactos = contactoDAO.findAll();
		model.addAttribute("contactos", contactos);
		return "contactos";
	}
	@PostMapping(path = "/contacto/add", consumes = "application/json")
	public void addContacto(@Validated @RequestBody  Contacto contacto) {
		contactoDAO.addContacto(contacto);
		
	}
	@PostMapping(path="/contacto/update", consumes="application/json")
	public void updateContacto(long id, Contacto contacto) {
		contactoDAO.updateContacto(id, contacto);
	}
	
	
	
	/*
	 * @PostMapping("/add")
	public void addPersona(@Validated @RequestBody Persona persona) {
		personaDAO.addPersona(persona);
	
	}
	 * 
	 * 
	 * */
}
