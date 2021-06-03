package com.company;
//BACKED BY ARRAYS
public class Stack {
    static final int MAX = 1000;//a static value of the stack
    int top;//pointer to the index at the top
    int[] a = new int[MAX];//maximum size of the Stack

    //Stack constructor
    Stack() {
        top = -1;
    }

    //IS EMPTY
    boolean isEmpty() {
        return (top < 0);
    }

    //PUSH
    void push(int val) {
        if(top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
        }
        else {
            //stacks will start adding at index 1
            a[++top] = val;
            System.out.println(val + " is pushed into stack");
        }
    }

    //POP
    int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            //the index of top has
            //decremented as the initial top is popped
            return a[top--];
            //now the value at top is this
        }
    }

    //PEEK
    int peek() {
        if(top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int val = a[top];
            System.out.print("Top element is: ");
            return val;
        }
    }

    //Traverse stack
    void printStack() {
        if(top < 0) {
            System.out.println("Stack Underflow");
        }
        else {
            int iter = top;
            System.out.print("Elements present in stack: ");
            while(iter >= 0) {
                System.out.print(a[iter] + " ");
                iter--;
            }
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " is popped from the stack");
        System.out.println("Is the stack empty: " + s.isEmpty());
        System.out.println(s.peek());
        s.printStack();
    }
}
