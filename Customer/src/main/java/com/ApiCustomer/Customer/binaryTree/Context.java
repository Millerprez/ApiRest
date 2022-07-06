package com.ApiCustomer.Customer.binaryTree;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.ApiCustomer.Customer.models.CustomerM;

@Service
public class Context {

    BinaryTree bt;
    
    public void loadTree(){
        bt = new BinaryTree();
        List<CustomerM> list = getCustomerList();
        for (CustomerM c : list) {
            bt.addNode(c.getId(), c);
        }
    }
    
    public CustomerM serchCustomer(int id){
        CustomerM customer = bt.searchNode(id).getContent();
        return customer;
    }

    public void saveCustomer(CustomerM customer){
        bt.addNode(customer.getId(), customer);
    }

    public void updateCustomer(CustomerM customer){
        bt.updateNode(customer.getId(), customer);
    }

    public void showTree(Node aux){
        if(aux != null){
            showTree(aux.getLeft());
            System.out.println(aux.getId());
            showTree(aux.getRight());
        }
    }

    public List<CustomerM> getCustomerList(){
        String url = "http://localhost:8080/ApiRest/customer/list";
        CustomerM[] list = new RestTemplate().getForObject(url, CustomerM[].class);
        return Arrays.asList(list);
    } 
}
