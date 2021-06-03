package com.company;

public class CLL {
    private static Node last;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node toEmpty(Node last, int data) {
        if(last != null) {
            //the list isn't empty
            return last;
        }

        Node temp = new Node(data);
        temp.next = temp;
        last = temp;
        return last;
    }

    static Node toBeginning(Node last, int data) {
        if(last == null) {
            //the list is empty
            return toEmpty(last,data);
        }

        Node temp = new Node(data);
        temp.next = last.next;
        last.next = temp;

        return last;
    }

    static Node toEnd(Node last, int data) {
        if(last == null) {
            //the list is empty
            return toEmpty(last,data);
        }

        Node temp = new Node(data);
        temp.next = last.next;
        last.next = temp;
        last = temp;

        return last;
    }

    static Node addAfter(Node last, int data, int item) {
        if(last == null) {
            return last;
        }

        Node temp = new Node(data);
        Node first = last.next;

        do{
            if(first.data == item) {
                temp.next = first.next;
                first.next = temp;

                if(first == last) {
                    last = temp;
                }
                return last;
            }
            first = first.next;
        }
        while(first != last.next);

        System.out.println(item + " is not present in the list.");
        return last;
    }

    static void printList(Node last) {
        if(last == null) {
            System.out.println("list is empty");
            return;
        }

        Node first = last.next;
        do{
            System.out.print(first.data + " ");
            first = first.next;
        }
        while(first != last.next);
    }

    public static void main(String[] args) {
        Node last = null;

        last = toEmpty(null,6);
        last = toBeginning(last,4);
        last = toBeginning(last, 2);
        last = toEnd(last,8);
        last = toEnd(last,12);
        last = addAfter(last,10,8);

        printList(last);
    }
}