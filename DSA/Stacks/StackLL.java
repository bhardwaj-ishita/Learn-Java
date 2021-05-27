package com.company;

public class StackLL {
    private static StackNode root;//pointer to the top of the stack

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            this.data = data;
        }
    }

    public static boolean isEmpty() {
        return root == null;
    }

    public static void push(int data) {
        StackNode newNode = new StackNode(data);
        if (root == null)
            root = newNode;
        else {
            StackNode temp = root;
            root = newNode;
            newNode.next = temp;
            //exchanged the newNode and root
        }
        System.out.println(data + " pushed to stack");
    }

    public static int pop() {
        int popped = Integer.MIN_VALUE;
        if (root == null)
            System.out.println("Stack is empty");
        else {
            popped = root.data;
            root = root.next;
        }
        return popped;
    }

    public static int peek() {
        if (root == null) {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        } else {
            return root.data;
        }
    }

    static void printStack() {
        if (root == null) {
            System.out.println("Stack Underflow");
        } else {
            StackNode iter = root;
            System.out.print("Elements present in stack: ");
            while (iter != null) {
                System.out.print(iter.data + " ");
                iter = iter.next;
            }
        }
    }

    public static void main(String[] args) {
        StackLL sll = new StackLL();

        root = null;
        push(10);
        push(20);
        push(30);

        System.out.println(pop() + " is popped from the stack");
        System.out.println("Is the stack empty: " + isEmpty());
        System.out.println("Top element is: " + peek());
        printStack();
    }
}