package com.trg.ecommerce.service.Impl;

import org.springframework.stereotype.Service;

import com.trg.ecommerce.repository.CustomerRepository;
import com.trg.ecommerce.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    
}
