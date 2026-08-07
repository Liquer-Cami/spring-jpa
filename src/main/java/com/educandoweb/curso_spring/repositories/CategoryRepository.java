package com.educandoweb.curso_spring.repositories;

import com.educandoweb.curso_spring.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
