package com.xproce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xproce.entities.Customer;
import java.util.List;


/**
 * CustomerRepository
 */
public interface CustomerRepository extends JpaRepository<Customer, Long>{
    List<Customer> findByEmail(String email);
    
}