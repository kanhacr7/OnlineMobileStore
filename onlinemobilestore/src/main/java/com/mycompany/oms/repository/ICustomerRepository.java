package com.mycompany.oms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mycompany.oms.entities.Customer;

public interface ICustomerRepository extends JpaRepository<Customer, Integer>{

}
