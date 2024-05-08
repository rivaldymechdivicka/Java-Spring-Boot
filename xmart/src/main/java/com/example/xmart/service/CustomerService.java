package com.example.xmart.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.xmart.entity.Customer;
import com.example.xmart.excaption.ResourceNotFoundException;
import com.example.xmart.repository.CustomerRepository;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public Customer findById(String id) {
        return customerRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Customer dengan QRCode tersebut tidak ditemukan"));
    }

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    public Customer create(Customer customer) {
        customer.setQrCode(UUID.randomUUID().toString());
        return customerRepository.save(customer);
    }

    public Customer edit(Customer customer) {
        return customerRepository.save(customer);
    }

    public void deleteById(String id) {
        customerRepository.deleteById(id);
    }
}