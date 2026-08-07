package com.educandoweb.curso_spring.repositories;

import com.educandoweb.curso_spring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
