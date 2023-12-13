package leetcode.medium;

import java.util.*;

/*
15. 3Sum
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k,
 and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.



Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation:
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.

Example 2:
Input: nums = [0,1,1]
Output: []
Explanation: The only possible triplet does not sum up to 0.

Example 3:
Input: nums = [0,0,0]
Output: [[0,0,0]]
Explanation: The only possible triplet sums up to 0.


Constraints:

3 <= nums.length <= 3000
-105 <= nums[i] <= 105
 */
public class ThreeSum {
    public static void main(String[] args) {
        int[] nums1 = {-1,0,1,2,-1,-4};
        int[] nums2 = {0,1,1};
        int[] nums3 = {0,0,0};
        System.out.println(threeSum(nums1)); // [[-1,-1,2],[-1,0,1]]
        System.out.println(threeSum(nums2)); // []
        System.out.println(threeSum(nums3)); // [[0,0,0]]


    }
    // Approach 1: BruteForce Method
    public static List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length < 3) return new ArrayList<>();
        Set<List<Integer>> output = new HashSet<>();
        Arrays.sort(nums);
        for(int i = 0; i<nums.length;i++) {
            for(int j=i + 1; j < nums.length; j++) {
                for(int k = j+1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if(sum == 0) {
                        output.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    }
                }
            }
        }
        return new ArrayList<>(output);

    }
    // Approach 2: Binary Search Method
    public static List<List<Integer>> threeSum2(int[] nums) {
        if(nums == null || nums.length < 3) return new ArrayList<>();
        Set<List<Integer>> results = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0) {
                    results.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return new ArrayList<>(results);
    }
}
