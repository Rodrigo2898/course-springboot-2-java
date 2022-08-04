package com.testeWS.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testeWS.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Integer>{

}
