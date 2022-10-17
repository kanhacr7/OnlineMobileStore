package com.mycompany.oms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mycompany.oms.entities.Order;

public interface IOrderRepository extends JpaRepository<Order, Integer>{

}
