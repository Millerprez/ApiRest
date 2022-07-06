package com.ApiCustomer.Customer.binaryTree;

import com.ApiCustomer.Customer.models.CustomerM;

public class Node {
    private Node father;
    private Node right;
    private Node left;
    private int id;
    private CustomerM content;

    public Node(int index){
        id = index;
        father = null;
        right = null;
        left = null;
        content = null;
    }

    public Node getFather() {
        return father;
    }

    public void setFather(Node father) {
        this.father = father;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CustomerM getContent() {
        return content;
    }

    public void setContent(CustomerM content) {
        this.content = content;
    }
}
