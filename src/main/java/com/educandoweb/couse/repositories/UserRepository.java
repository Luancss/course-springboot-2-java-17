package com.educandoweb.couse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.couse.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
