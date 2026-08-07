package com.educandoweb.curso_spring.repositories;

import com.educandoweb.curso_spring.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
