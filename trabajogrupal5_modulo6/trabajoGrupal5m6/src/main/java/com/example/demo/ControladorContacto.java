package com.example.demo;

import java.util.List;



import com.example.demo.DAO.ContactoDAO;
import com.example.demo.modelo.Contacto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;



@Controller
public class ControladorContacto {
	
private final ContactoDAO contactoDAO;
	
	public ControladorContacto(ContactoDAO contactoDAO) {
		this.contactoDAO=contactoDAO;
		
	}

	@GetMapping("/contacto")
	public String contacto() {
		
		return "contacto";
	}
	
	@GetMapping("/contacto/all")
	public String findAll(Model model) {
		List<Contacto> contactos = contactoDAO.findAll();
		model.addAttribute("contactos", contactos);
		return "contactos";
	}
	/*
	 *  @GetMapping("/contacto/all")
    public String findAll(Model model) {
        List<Contacto> contactos = contactoDAO.findAll();
        model.addAttribute("contactos", contactos);
        return "contactos"; // Devuelve el nombre del archivo HTML sin la extensión
    }
	 * 
	 * 
	 * */
}
