package com.testeWS.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testeWS.course.entities.User;
import com.testeWS.course.repositories.UserRepository;

//Registrando o UserService como componente
@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll() {
		return repository.findAll();
	}
	
	public User findById(Integer id) {
		Optional<User>obj = repository.findById(id);
		return obj.get();
	}
}
