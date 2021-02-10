package com.company;

public class Main {

    public static void main(String[] args) {
        SLinkedList sLinkedList=new SLinkedList();
        sLinkedList.insertAtFirst("Hello");
        sLinkedList.insertAtFirst("Bikram");
        sLinkedList.insertAtFirst("Chand");
        sLinkedList.insertAtFirst("Puja");
        sLinkedList.insertAtFirst("Chand");
        sLinkedList.insertAtFirst("chah");
        sLinkedList.insertAtMiddle("Mithun");
        sLinkedList.insertAtNthNode(3,"three");
        sLinkedList.removeMiddleElement();
        sLinkedList.removeNthNode(2);
        sLinkedList.removeNthNode(3);
        sLinkedList.display();



        /*
        sLinkedList.insertAtEnd("End");
        sLinkedList.insertAtEnd("End of world");
        sLinkedList.display();

         */
    }
}
