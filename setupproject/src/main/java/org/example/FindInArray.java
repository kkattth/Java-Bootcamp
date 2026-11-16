package org.example;

public class FindInArray {

    static void main() {

        int[] nums = {100, 1, 4, 15};

        int big = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > big) {
                big = nums[i];
            }
        }

        System.out.println(big);


    }
}
