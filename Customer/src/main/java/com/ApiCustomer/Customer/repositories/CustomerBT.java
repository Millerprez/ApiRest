package com.ApiCustomer.Customer.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ApiCustomer.Customer.binaryTree.Context;
import com.ApiCustomer.Customer.models.CustomerM;

@Service
public class CustomerBT {
    
    @Autowired
    private Context context;

    public CustomerM findById(int id){
        context.loadTree();
        return context.serchCustomer(id);
    }
    
    public void saveCustomer(CustomerM c){
        context.loadTree(); 
        context.saveCustomer(c);
        
    }

    public void updateCustomer(CustomerM c){
        context.loadTree(); 
        context.updateCustomer(c);
    }
}
