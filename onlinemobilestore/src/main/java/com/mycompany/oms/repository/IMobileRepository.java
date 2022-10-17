package com.mycompany.oms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mycompany.oms.entities.Mobile;

public interface IMobileRepository extends JpaRepository<Mobile, Integer>{

}
