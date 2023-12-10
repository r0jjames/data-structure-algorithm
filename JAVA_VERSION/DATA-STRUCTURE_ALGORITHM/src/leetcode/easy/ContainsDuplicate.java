package leetcode.easy;

import java.util.HashMap;
import java.util.HashSet;

/*
https://leetcode.com/problems/contains-duplicate/description/
217. Contains Duplicate
Given an integer array nums, return true if any value appears at least twice in the array,
and return false if every element is distinct.

Example 1:
Input: nums = [1,2,3,1]
Output: true

Example 2:
Input: nums = [1,2,3,4]
Output: false

Example 3:
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
 */
public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums1 ={1,2,3,1};
        int[] nums2 ={1,2,3,4};
        int[] nums3 ={1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate2(nums2));
    }
    // Approach 1: Using Hashmap
    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
    // Approach 2: Using Hashset
    public static boolean containsDuplicate2(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums) {
            if(!set.add(i)) {
                return true;
            }
        }
        return false;
    }
}
