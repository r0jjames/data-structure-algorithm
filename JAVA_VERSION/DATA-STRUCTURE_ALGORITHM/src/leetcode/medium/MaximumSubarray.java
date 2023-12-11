package leetcode.medium;

import java.util.Arrays;

/*
https://leetcode.com/problems/maximum-subarray/
53. Maximum Subarray
Given an integer array nums, find the subarray
 with the largest sum, and return its sum.


Example 1:
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.

Example 2:
Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.

Example 3:
Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.


Constraints:

1 <= nums.length <= 105
-104 <= nums[i] <= 104


Follow up: If you have figured out the O(n) solution,
try coding another solution using the divide and conquer approach, which is more subtle.
Note:
We have 2 options to solve this
Brute force — calculate the sum of each possible subarray and compare, then return the highest value.
Kadane’s algorithm — instead of calculating each maximum sum, we calculate it based on comparing whether an element always increases a sum of subarray and if its value is higher than the sum of the subarray that includes previous elements.
 */
public class MaximumSubarray {
    public static void main(String[] args) {
        int[] num1 = {-2,1,-3,4,-1,2,1,-5,4};
        int[] num2 = {1};
        int[] num3 = {5,4,-1,7,8};
        System.out.println(maxSubArray1(num1)); //6
        System.out.println(maxSubArray1(num2)); //1
        System.out.println(maxSubArray1(num3)); //23

    }
    // Approach 1: Brute Force Solution
    public static int maxSubArray1(int[] nums) {
        int currSum = nums[0];
        int maxSum = currSum;
        for (int i = 0; i < nums.length; i++) {
            currSum = nums[i];
            if (currSum > maxSum) {
                maxSum = currSum;
            }
            for (int j = i + 1; j < nums.length; j++) {
                currSum = currSum + nums[j];
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }
        return maxSum;
    }
    // Approach 2: Using Kadane’s Algorithm
    public static int maxSubArray2(int[] nums) {
        int maxSubarray = nums[0];
        int currentMaxArray = maxSubarray;

        for(int i=1; i < nums.length; i++) {
            currentMaxArray = Math.max(currentMaxArray + nums[i], nums[i]);
            if(currentMaxArray > maxSubarray) {
                maxSubarray = currentMaxArray;
            }
            if(currentMaxArray <0) return 0;
        }
        return maxSubarray;
    }
    public static int maxSubArray3(int[] a) {
        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;
        int n = a.length;
        for(int i=0; i<n ; i++){
            curSum += a[i];
            maxSum = Math.max(curSum, maxSum);
            if(curSum <0) { curSum = 0; }
        }
        return maxSum;
    }
}
