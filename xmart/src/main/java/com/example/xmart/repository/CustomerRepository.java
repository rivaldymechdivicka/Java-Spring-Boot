package com.example.xmart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.xmart.entity.Customer;


public interface CustomerRepository extends JpaRepository<Customer, String> {

}