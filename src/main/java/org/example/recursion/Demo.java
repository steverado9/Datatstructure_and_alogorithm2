package org.example.recursion;

public class Demo {
    public static void main(String[] args) {

        int result = fact(4);
        System.out.println(result);
    }

    public static int fact(int i) {

        if(i != 0) {
            return i * fact(i - 1);
        }

        return 1;
    }
}
//5! = 5 x 4 x 3 x 2 x 1
//5! = 5 x 4!
