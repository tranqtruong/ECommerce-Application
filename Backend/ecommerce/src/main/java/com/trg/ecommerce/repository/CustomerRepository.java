package com.trg.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trg.ecommerce.entity.Customer;

/**
 * CustomerRepository
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer findByEmail(String email);
}
