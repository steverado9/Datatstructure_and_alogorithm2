package org.example.linkedList;

import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        LinkedList nums = new LinkedList();

        nums.add(5);
        nums.add(9);

        nums.addFirst(6);
        System.out.println(nums.get(2));
        System.out.println("The head element is: " + nums.peek()); //this is to get the head element

        System.out.println(nums);
    }
}
