package com.ApiCustomer.Customer.binaryTree;

import com.ApiCustomer.Customer.models.CustomerM;

public class BinaryTree {
    Node root;

    public BinaryTree(){
        root = null;
    }

    public  void addNode(int index, CustomerM customer){
        Node node = new Node(index);
        node.setContent(customer);

        if(root == null){
            root = node;
        } else {
            Node aux = root;
            while (aux != null){
                node.setFather(aux);
                if (node.getId() >= aux.getId()){
                    aux = aux.getRight();
                } else {
                    aux = aux.getLeft();
                }
            }

            if(node.getId() < node.getFather().getId()){
                node.getFather().setLeft(node);
            } else {
                node.getFather().setRight(node);
            }
        }
    }

    public Node searchNode(int id){
        Node aux = root;

        while (aux.getId() != id){
            if (id < aux.getId()){
                aux = aux.getLeft();
            } else {
                aux = aux.getRight();
            }
        }
        return aux != null ? aux : null;
    }

    public boolean updateNode(int id, CustomerM customer){
        Node aux =  searchNode(id);
        if(aux != null){
            aux.setContent(customer);
            return  true;
        }
        return false;
    }
}
