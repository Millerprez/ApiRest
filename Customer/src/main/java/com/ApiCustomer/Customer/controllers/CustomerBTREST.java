package com.ApiCustomer.Customer.controllers;


import java.util.HashMap;
import java.util.Map;
import java.util.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ApiCustomer.Customer.models.CustomerM;
import com.ApiCustomer.Customer.repositories.CustomerBT;
import com.ApiCustomer.Customer.repositories.CustomerR;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class CustomerBTREST {
    
    private static final SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");

    @Autowired
    private CustomerBT customer;

    @Autowired
    private CustomerR customerR;

    @GetMapping("/customers/{id}")
    public CustomerM getCustomer(@PathVariable int id){
        CustomerM customer;
        try {
            customer = this.customer.findById(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        return customer;
    }
    
    @PostMapping("/customers/save")
    public ResponseEntity<?> saveCustomer(@RequestBody CustomerM customer){
        Map<String, Object> response = new HashMap<>();
        try {
            customer.setDateRecord(sdf1.format(new Timestamp(new Date().getTime())));
            customer.setDateUnsubs(sdf1.format(new Timestamp(new Date().getTime())));
            this.customer.saveCustomer(customer);
            this.customerR.save(customer);
            response.put("name", "Cliente guardado con éxito");
        } catch (Exception e) {
            response.put("name", "No fue posible agregar al cliente".concat(String.valueOf(customer.getId()).toString()));
            response.put("Error", e.getMessage());
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        
        return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
    }
    
    @PutMapping("/customers/update")
    public ResponseEntity<?> updateCustomer(@RequestBody CustomerM customer){
        Map<String, Object> response = new HashMap<>();
        try {
            this.customer.updateCustomer(customer);
            this.customerR.save(customer);
            response.put("name", "Cliente actualizado con éxito");
        } catch (Exception e) {
            response.put("name", "No fue posible agregar al cliente".concat(String.valueOf(customer.getId()).toString()));
            response.put("Error", e.getMessage());
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        
        return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
    }
}
