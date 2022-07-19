package com.educandoweb.couse.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.couse.entities.User;
import com.educandoweb.couse.repositories.UsuarioRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public void run(String... args) throws Exception {

		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"); 
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 
		
		usuarioRepository.saveAll(Arrays.asList(u1,u2));
	}
	
	
}

