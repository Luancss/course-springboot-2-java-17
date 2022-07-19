package com.educandoweb.couse.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.couse.entities.User;
import com.educandoweb.couse.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository repository;
	
	public List<User> findAll() {
		return repository.findAll();
	}
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
}
