package com.testeWS.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testeWS.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
