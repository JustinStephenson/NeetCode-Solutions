package org.example.problems.arrays;

/*
    Given an integer array nums, return an array output where output[i] is the product of all the elements of nums except nums[i].

    Each product is guaranteed to fit in a 32-bit integer.
 */

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        // Prefix array
        int[] prefix = new int[nums.length];
        prefix[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = nums[i - 1] * prefix[i - 1];
        }

        // Postfix array
        int[] postfix = new int[nums.length];
        postfix[nums.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            postfix[i] = nums[i + 1] * postfix[i + 1];
        }

        // Output array
        int[] output = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            output[i] = prefix[i] * postfix[i];
        }

        return output;
    }

    // Same as above but with O(n) space
    public int[] productExceptSelfNoExtraSpace(int[] nums) {
        // Output array
        int[] output = new int[nums.length];

        // Prefix part
        output[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            output[i] = nums[i - 1] * output[i - 1];
        }

        // Postfix part
        int postfix = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            output[i] *= postfix;
            postfix *= nums[i];
        }

        return output;
    }
}
