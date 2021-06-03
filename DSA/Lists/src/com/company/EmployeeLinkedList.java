package com.company;

public class EmployeeLinkedList {
    //all we need to know about the lists to do the functions we just need the head

    private EmployeeNode head;
    private int size; //it's easier to keep the count as we add a new node to the front of the linked list


    //function number 1
    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
        //first we created a new node at the front of the current head node
        //then we gave the new node a reference to the next node i.e the current head node i.e we linked it to the next node
        //then we changed the head node pointer from the current node to the new node
        size++;
    }

    public int getSize() {
        return size;
    }

    //function number 2
    public void printList() {
        EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while(current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
        //current is an EmployeeNode object and
        // when we print it, the toString method comes into play
        // which is furthermore connected to the Employee class.
        // As the parameters of the EmployeeNode all are from Employee Class
        //SinglyLinkedList --> EmployeeLinkedList --> EmployeeNode --> Employee (toString())
    }

}
