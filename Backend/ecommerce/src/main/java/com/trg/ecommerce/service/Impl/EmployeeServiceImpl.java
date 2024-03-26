package com.trg.ecommerce.service.Impl;

import org.springframework.stereotype.Service;

import com.trg.ecommerce.repository.EmployeeRepository;
import com.trg.ecommerce.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    
}
