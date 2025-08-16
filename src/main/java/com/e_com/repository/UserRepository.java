package com.e_com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.e_com.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
