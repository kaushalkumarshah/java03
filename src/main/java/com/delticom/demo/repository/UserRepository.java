package com.delticom.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.delticom.demo.model.User;

public interface UserRepository  extends JpaRepository<User, Integer>{

}
