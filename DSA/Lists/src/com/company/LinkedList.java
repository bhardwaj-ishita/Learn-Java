package com.company;

class LinkedList {
    Node head;
    int size;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    void printList() {
        Node n = head;
        while(n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    void deleteNode(int key) {
        //here the key is the data
        Node temp = head, prev = null;

        //first we'll check the head
        if(temp != null && temp.data == key) {
            head = temp.next;
            return;
            //deleting head simply means giving the
            //head position to the next node because
            //head is only connected to head.next and
            //now we've removed it's existence
        }

        //if it isn't head then we'll check all the
        //other nodes - null
        while(temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        //if none of the nodes have the key and we've
        //come to the end i.e. Null then we'll return
        if(temp == null) {
            return;
        }

        //if we've found the node then we'll unlink it
        prev.next = temp.next;
        //prev < prev.next == temp < temp.next
        size--;
    }

    //adding anything before the head makes that new
    //"anything" the new head
    public void push(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public static void main(String[] args) {
        LinkedList llist = new LinkedList();

        llist.push(6);
        llist.push(1);
        llist.push(5);
        llist.push(2);
        llist.push(4);

        System.out.print("Created list: ");
        llist.printList();
        System.out.println("\nSize of the list is: " + llist.size);

        llist.deleteNode(1);

        System.out.print("\nList after deletion: ");
        llist.printList();

        System.out.println("\nSize of the list is: " + llist.size);
    }

}