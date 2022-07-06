package com.ApiCustomer.Customer.controllers;


import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
public class CustomerBTREST {
    
    @Autowired
    private CustomerBT customer;

    @Autowired
    private CustomerR customerR;

    @GetMapping("/customers/{id}")
    public ResponseEntity<?> getCustomer(@PathVariable int id){
        Map<String, Object> response = new HashMap<>();

        try {
            CustomerM customer = this.customer.findById(id);
            response.put("customer", customer);
        } catch (Exception e) {
            response.put("Message","No fue encontrado el Cliente");
            response.put("Error", e.getMessage());
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
    }
    
    @PostMapping("/customers/save")
    public ResponseEntity<?> saveCustomer(@RequestBody CustomerM customer){
        Map<String, Object> response = new HashMap<>();
        try {
            this.customer.saveCustomer(customer);
            this.customerR.save(customer);
            response.put("Mensaje", "Cliente guardado con éxito");
        } catch (Exception e) {
            response.put("Mensaje", "No fue posible agregar al cliente".concat(String.valueOf(customer.getId()).toString()));
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
            response.put("Mensaje", "Cliente actualizado con éxito");
        } catch (Exception e) {
            response.put("Mensaje", "No fue posible agregar al cliente".concat(String.valueOf(customer.getId()).toString()));
            response.put("Error", e.getMessage());
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        
        return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
    }
}
