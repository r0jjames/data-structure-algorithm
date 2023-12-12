package leetcode.medium;
/*
https://leetcode.com/problems/maximum-product-subarray/description/
152. Maximum Product Subarray
Given an integer array nums, find a subarray that has the largest product, and return the product.
The test cases are generated so that the answer will fit in a 32-bit integer.

Example 1:
Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.

Example 2:
Input: nums = [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.


Constraints:

1 <= nums.length <= 2 * 104
-10 <= nums[i] <= 10
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 */
public class MaximumProductArray {
    public static void main(String[] args) {
        int[] num1 = {2,3,-2,4};
        int[] num2 = {-2,0,-1};
        int[] num3 = {-2,3,-4};
        int[] num4 = {0, 4};
        System.out.println(maxProduct2(num1)); //6
        System.out.println(maxProduct2(num2)); //0
        System.out.println(maxProduct2(num3)); //24
        System.out.println(maxProduct2(num4)); //4

    }
    // Approach 1: Brute Force Solution
    public static int maxProduct1(int[] nums) {
        int maxLargestProduct = nums[0];
        int currentMax;
        for(int i=0; i<nums.length; i++) {
            currentMax = nums[i];
            if(currentMax > maxLargestProduct) {
                maxLargestProduct = currentMax;
            }
            for(int j=i+1; j < nums.length; j++) {
                currentMax *= nums[j];
                if(currentMax > maxLargestProduct) {
                    maxLargestProduct = currentMax;
                }
            }
        }
        if(maxLargestProduct < 0) return 0;
        return maxLargestProduct;
    }
    // Approach 2:
    public static int maxProduct2(int[] nums) {
        int maxLargestProduct = nums[0];
        int leftProduct = 1;
        int rightProduct = 1;
        for(int i=0; i < nums.length; i++) {
            leftProduct = leftProduct == 0 ? 1 : leftProduct;
            rightProduct = rightProduct == 0 ? 1: rightProduct;

            leftProduct *= nums[i];
            rightProduct *= nums[nums.length - 1 - i];
            maxLargestProduct = Math.max(maxLargestProduct, Math.max(leftProduct, rightProduct));
        }
        return maxLargestProduct;
    }

}
