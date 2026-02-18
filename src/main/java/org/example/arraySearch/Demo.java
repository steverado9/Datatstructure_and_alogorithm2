package org.example.arraySearch;

public class Demo {
    public static void main(String[] args) {

        int nums[] = {5, 7, 9, 11, 13};

        int target = 9;

        int result1 = linearSearch(nums, target);
        //making it recursive
        int result2 = binarySearch(nums, target, 0, nums.length );

        if(result2 != -1)
            System.out.println("Element found at index : " + result2);
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
//        int left = 0;
//        int right = nums.length;

        if(left <= right) {
            int mid = (left + right)/2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                return binarySearch(nums, target, mid+1, right);
            } else {
                return binarySearch(nums, target, left, mid-1);
            }
        }

//        while(left <= right) {
//            steps++;
//            int mid = (left + right)/2;
//
//            if (nums[mid] == target) {
//                System.out.println("steps for binary: " + steps);
//                return mid;
//            } else if (nums[mid] < target) {
//                left = mid + 1;
//            } else {
//                right = mid -1;
//            }
//        }
//        System.out.println("steps for binary: " + steps);
        return -1;
    }
}