package leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;

/*
https://leetcode.com/problems/two-sum/
1. Two Sum
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]


Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.


Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
 */
public class TwoSum {
    public static void main(String[] args) {

      /*
      Example 1:
        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
      Example 2:
        Input: nums = [3,2,4], target = 6
        Output: [1,2]
      Example 3:
        Input: nums = [3,3], target = 6
        Output: [0,1]

       */
        int[] nums = {3,2,4};
        int target = 6;

        System.out.println(Arrays.toString(twoSum3(nums, target)));

    }

    //Approach 1: Brute Force
    public static int[] twoSum(int[] nums, int target) {
        int[] results = new int[2];
        for(int i=0; i < nums.length; i++) {
            for(int j=i+1; j < nums.length; j++) {
                if(nums[i] == target-nums[j]) {
                    return new int[]{i,j};
                }
            }
        }
        return results;
    }
    //Approach 2: Two-pass Hash Table
    public static int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            map.put(nums[i], i);
        }

        for(int j=0; j < nums.length; j++) {
            int compliment = target-nums[j];
            if(map.containsKey(compliment) && map.get(compliment) != j) {
                return new int[] {j, map.get(compliment)};
            }
        }
        return null;
    }
    //Approach 3: One-pass Hash Table
    public static int[] twoSum3(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap();
        for(int i=0; i < nums.length; i++) {
            int compliment = target - nums[i];
            if(map.containsKey(compliment)) {
                return new int[] {map.get(compliment), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
