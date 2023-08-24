package com.example.demo.DAO;

import java.util.List;
import java.util.Optional;

import com.example.demo.modelo.Contacto;



public interface ContactoDAO {
	List<Contacto> findAll();
	Optional<Contacto> findById(long id);
	long deleteContacto(long id);
	long updateContacto(long id, Contacto contacto);
	long addContacto(Contacto contacto);
}
