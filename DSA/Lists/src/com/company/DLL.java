package com.company;

public class DLL {
    Node head;

    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    //add to the front
    void push(int key) {
        Node newNode = new Node(key);
        newNode.prev = null;
        newNode.next = head;

        if(head != null)
            head.prev = newNode;

        head = newNode;
    }

    //insert after a given node
    void insertAfter(Node prevNode, int key) {
        if(prevNode == null) {
            System.out.println("Previous node can't NULL ");
            return;
        }
        Node newNode = new Node(key);
        newNode.next = prevNode.next;
        newNode.prev = prevNode;
        prevNode.next = newNode;

        if(newNode.next != null)
            newNode.next.prev = newNode;
    }

    //add node at the end
    void append(int key) {
        Node newNode = new Node(key);
        Node last = head;
        newNode.next = null;

        if(head == null) {
            head = newNode;
            newNode.prev = null;
            return;
        }

        while(last.next != null) {
            last = last.next;
        }

        last.next = newNode;
        newNode.prev = last;
    }

    //prints list from the given node
    void printList(Node node) {
        Node last = null;
        System.out.println("Traversal in forward direction: ");
        while(node != null) {
            System.out.print(node.data + " ");
            last = node;
            node = node.next;
        }

        System.out.println();
        System.out.println("Traversal in reverse direction");
        while(last != null) {
            System.out.print(last.data + " ");
            last = last.prev;
        }
    }

    //delete nodes
    void deleteNode(Node del) {
        //base case (from tail)
        if(head == null || del == null)
            return;

        //from head
        if(del == head) {
            head = del.next;
            head.prev = null;
            return;
        }

        //from between
        //only if prev and next of del are not null
        if(del.next != null) {
            del.next.prev = del.prev;
        }

        if(del.prev != null) {
            del.prev.next = del.next;
        }
    }

    public static void main(String[] args) {
        DLL dll = new DLL();

        dll.append(6);
        dll.push(7);
        dll.push(1);
        dll.append(4);
        dll.insertAfter(dll.head.next, 8);

        System.out.println("Created DLL is: ");
        dll.printList(dll.head);
        System.out.println();

        dll.deleteNode(dll.head.next.next);
        System.out.println("after deleteing middle node: ");
        dll.printList(dll.head);
        System.out.println();

        dll.deleteNode(dll.head);
        System.out.println("after deleteing head node: ");
        dll.printList(dll.head);

    }
}