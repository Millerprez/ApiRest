package com.ApiCustomer.Customer.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ApiCustomer.Customer.models.CustomerM;
import com.ApiCustomer.Customer.repositories.CustomerR;

@RestController
@RequestMapping("/customer")
public class CustomerREST {

    @Autowired
    private CustomerR customerR;
    
    @GetMapping("/list")
    public List<CustomerM> getCustomer(){
        return (List<CustomerM>) customerR.findAll();
    }
}
