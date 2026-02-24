package org.example.stack;

public class Stack {
    private int[] arr;
    int top;
    int size;

    public Stack() {
        arr = new int[5];
        size = arr.length;
        top = -1;
    }

    public void push(int data) {
        if(top<size) {
            //pre increment
            arr[++top] = data;
        } else {
            System.out.println("Stack overflow");
        }
    }

    public int pop() {
       //return the value and decrease by 1
        if(top > -1)
            return arr[top--];
        else {
            System.out.println("Stack underflow");
        }
        return 0;
    }

    public int peek() {
        return arr[top];
    }

    public void printStack() {
        for(int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }


}
