package com.jonaspalhanos.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jonaspalhanos.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
