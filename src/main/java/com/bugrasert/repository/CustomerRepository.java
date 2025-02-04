package com.bugrasert.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bugrasert.entites.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
