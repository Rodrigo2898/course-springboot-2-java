package com.testeWS.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testeWS.course.entities.User;

@RestController  //recurso web, que é implementado por um controlador rest
@RequestMapping(value = "/users")
public class UserResource {

	// Método que vai ser um endpoint acessar os usuários
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1, "Maria", "maria@gmail.com", "99999999", "123456");
		return ResponseEntity.ok().body(u);
	}
}
