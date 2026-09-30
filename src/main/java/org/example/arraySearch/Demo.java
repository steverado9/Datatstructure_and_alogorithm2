package org.example.arraySearch;

public class Demo {
    public static void main(String[] args) {

        int nums[] = {5, 7, 9, 11, 13};

        int target = 13;

        int linearResult = linearSearch(nums, target);
        int binaryResult = binarySearch(nums, target, 0, nums.length - 1);

        if(binaryResult != -1)
            System.out.println("Element found at index : " + binaryResult);
        else
            System.out.println("Element not found");

    }

    public static int linearSearch(int[] nums, int target) {
        int steps = 0;
        for (int i = 0; i < nums.length; i++) {
            steps++;
            if (nums[i] == target) {
                System.out.println("steps taken by linear: " + steps);
                return i;
            }
        }
        System.out.println("steps for linear: " + steps);
        return -1;
    }

    public static int binarySearch(int[] nums, int target, int left, int right) {
        //5, 7, 9, 11, 13
        int steps = 0;

        while(left <= right) {
            steps++;
            int mid = (left + right)/2;

            if (nums[mid] == target) {
                System.out.println("steps for binary: " + steps);
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid -1;
            }
        }
        System.out.println("steps for binary: " + steps);
        return -1;
    }
}