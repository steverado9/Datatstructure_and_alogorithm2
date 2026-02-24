package org.example.stack;


public class Main {
    public static void main(String[] args) {

        //inbuilt stack
        Stack nums = new Stack();

        nums.push(10);
        nums.push(30);
        System.out.println(nums.pop());
        nums.push(70);
        nums.push(20);
        nums.push(50);
        nums.push(90);
        System.out.println(nums.peek());

        nums.printStack();


    }
}
