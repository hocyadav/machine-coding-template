package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Address;

@Repository
public interface AddressDAO extends JpaRepository<Address, Integer>{

}
