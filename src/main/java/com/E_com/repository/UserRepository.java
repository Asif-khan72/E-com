package com.E_com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.E_com.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
