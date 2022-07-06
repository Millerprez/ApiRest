package com.ApiCustomer.Customer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ApiCustomer.Customer.models.CustomerM;

@Repository 
public interface CustomerR extends JpaRepository<CustomerM, Integer> {

}