package com.company;

public class SLinkedList {
    //head in the list
    Node head;
    Node tail;
    //total number of nodes in the list
    private int size;
    private int count;

    public SLinkedList(){
        head=null;
        size=0;
    }

    //Insertion in a singly linked list
    public void insertAtFirst(String element){
        Node newNode=new Node(element);
        //pointing the newnode to the existing first node of the list
        newNode.next=head;
        //making a newNode as a head of the list
        head=newNode;
    }

    public void insertAtEnd(String element){
        Node newNode=new Node(element);
        if(head==null){
            head=newNode;
        }
        Node current_node=head;
        while (current_node.next!=null){
            current_node=current_node.next;
        }
        current_node.next=newNode;
        newNode.next=null;
    }

    public void insertAtMiddle(String element){
        Node newNode=new Node(element);
        if(head==null){
            head=newNode;
        }
        Node temp=head;
        Node current=null;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        int middle=count/2;
        Node tempNode=head;
        for(int i=0;i<middle;i++){
            current=tempNode;
            tempNode=tempNode.next;
            //System.out.println(tempNode);
        }
        current.next=newNode;
        newNode.next=tempNode;

    }

    public void insertAtNthNode(int node_position,String element){
        Node newNode=new Node(element);
        if(head==null){
            head=newNode;
        }
        Node currentNode=head;
        Node tempNode=null;
        for(int i=0;i<node_position;i++){
            tempNode=currentNode;
            currentNode=currentNode.next;
        }
        tempNode.next=newNode;
        newNode.next=currentNode;
    }

    public void removeFirst(){
        Node temp=head.next;
        head=temp;
    }

    public void removeLast(){
        Node currentNode=head;
        Node previous;
        Node temp=null;
        while(currentNode.next!=null){
            temp=currentNode;
            currentNode=currentNode.next;
        }
        temp.next=null;
    }

    public void removeMiddleElement(){
        int totalNodes=0;
        Node currentNode=head;
        while (currentNode.next!=null){
            totalNodes++;
            currentNode=currentNode.next;
        }
        int middle=totalNodes/2;
        Node temp=null;
        Node current=head;
        for(int i=0;i<middle-1;i++){
            temp=current;
            current=current.next;
        }
        Node temporary=null;
        Node c=head;
        for(int i=0;i<middle;i++){
            temporary=c;
            c=c.next;
        }
        temp.next=c;

    }

    public void removeNthNode(int position){
        Node currentNode=head;
        Node temp=null;
        for(int i=0;i<position-1;i++){
            temp=currentNode;
            currentNode=currentNode.next;
        }
        Node current=head;
        Node tempNode=null;
        for(int i=0;i<=position;i++){
            tempNode=current;
            current=current.next;
        }
        temp.next=current;
    }

    public void display(){
        while (head!=null){
            System.out.println(head.element);
            head=head.next;
        }
    }

}
