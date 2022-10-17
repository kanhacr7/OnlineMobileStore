package com.mycompany.oms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mycompany.oms.entities.User;

public interface IUserRepository extends JpaRepository<User, Integer>{

}
