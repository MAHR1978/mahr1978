package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.DAO.UsuariosDAO;
import com.example.demo.modelo.Usuario;

@Controller
public class ControladorUsuario {
	
	private final UsuariosDAO usuarioDAO;
	
	public ControladorUsuario(UsuariosDAO usuarioDAO) {
		this.usuarioDAO = usuarioDAO;
	}
	
	
	@GetMapping("/usuarios")
	public String usuarios() {
		
		return "usuarios";
	}
	
	@GetMapping("/usuarios/all")
	public String findall(Model model) {
		List<Usuario> usuario= usuarioDAO.findAll();
		model.addAttribute("usuarios",usuario);
		
		return "usuario";
		
	}
}
