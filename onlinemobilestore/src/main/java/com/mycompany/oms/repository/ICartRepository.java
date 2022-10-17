package com.mycompany.oms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mycompany.oms.entities.Cart;

public interface ICartRepository extends JpaRepository<Cart, Integer>{

}
