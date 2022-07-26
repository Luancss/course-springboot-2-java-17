package com.educandoweb.couse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.couse.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
