package com.company;

public class Node {
    Node next;
    String element;
    public Node(String element){
        this.element=element;
        next=null;
    }


    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNode(){
        return next;
    }


    public void setElements(String elements) {
        this.element= elements;
    }

    public String getElements(){
        return element;
    }

}
