package com.company;

public class middleNumber {
    Node head;

    static class Node {
        Node next;
        int val;

        Node() { }
        Node(int val) {
            this.val = val;
        }
        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    //Method 1
    public Node arrayOutput(Node head) {
        Node[] A = new Node[100];
        int i = 0;
        while(head != null) {
            A[i++] = head;
            head = head.next;
        }
        return A[i/2];
    }

    //Method 2
    public Node fastSlowPointer(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast != null || fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }



}
