package leetcode.medium;

/*
https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
153. Find Minimum in Rotated Sorted Array
Suppose an array of length n sorted in ascending order is rotated between 1 and n times.
For example, the array nums = [0,1,2,4,5,6,7] might become:

[4,5,6,7,0,1,2] if it was rotated 4 times.
[0,1,2,4,5,6,7] if it was rotated 7 times.
Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

Given the sorted rotated array nums of unique elements, return the minimum element of this array.

You must write an algorithm that runs in O(log n) time.

Example 1:
Input: nums = [3,4,5,1,2]
Output: 1
Explanation: The original array was [1,2,3,4,5] rotated 3 times.

Example 2:
Input: nums = [4,5,6,7,0,1,2]
Output: 0
Explanation: The original array was [0,1,2,4,5,6,7] and it was rotated 4 times.

Example 3:
Input: nums = [11,13,15,17]
Output: 11
Explanation: The original array was [11,13,15,17] and it was rotated 4 times.


 */
public class FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {3,4,5,1,2};
        int[] nums2 = {4,5,6,7,0,1,2};
        int[] nums3 = {11,13,15,17};
        System.out.println(findMin2(nums1)); //1
        System.out.println(findMin2(nums2)); //0
        System.out.println(findMin2(nums3)); //11
    }
    // Approach 1: Brute force
    public static int findMin1(int[] nums) {
        int minArray = nums[0];
        for(int i=0; i < nums.length; i++) {
            for(int j=i + 1; j < nums.length; j++) {
                minArray = Math.min(minArray, Math.min(nums[i], nums[j]));
            }
        }
        return minArray;
    }
    // Approach 2: Binary Search O(log n) time
    public static int findMin2(int[] nums) {
        int minArray;
        int left = 0;
        int right = nums.length - 1;
        while(left + 1 < right) {
            int mid = left + (right - left) /2;
            if(nums[mid] > nums[mid+1]) {
                left = mid;
            } else {
                right = mid;
            }
        }
        minArray = Math.min(nums[left], nums[right]);
        return minArray;

    }
}
