package com.testeWS.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testeWS.course.entities.Product;
import com.testeWS.course.repositories.ProductRepository;

//Registrando o ProductService como componente
@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll() {
		return repository.findAll();
	}
	
	public Product findById(Integer id) {
		Optional<Product>obj = repository.findById(id);
		return obj.get();
	}
}
