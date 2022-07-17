package com.educandoweb.couse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.couse.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
