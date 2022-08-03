package com.testeWS.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testeWS.course.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
