package leetcode.medium;
/*
https://leetcode.com/problems/search-in-rotated-sorted-array/description/
33. Search in Rotated Sorted Array
There is an integer array nums sorted in ascending order (with distinct values).

Prior to being passed to your function, nums is possibly rotated at an unknown pivot index
k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).
For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4

Example 2:
Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1

Example 3:
Input: nums = [1], target = 0
Output: -1


Constraints:

1 <= nums.length <= 5000
-104 <= nums[i] <= 104
All values of nums are unique.
nums is an ascending array that is possibly rotated.
-104 <= target <= 104
 */
public class SearchInRotatedSortedArray {

    public static void main(String[] args) {
        int[] nums1 = {4,5,6,7,0,1,2};
        int target1 = 0;
        int[] nums2 = {4,5,6,7,0,1,2};
        int target2 = 3;
        int[] nums3 = {1};
        int target3 = 0;
        System.out.println(search(nums1, target1)); //4
        System.out.println(search(nums2, target2)); //-1
        System.out.println(search(nums3, target3)); //-1

    }
    // Approach 1: Brute force method
    public static int alternateSearch(int[] nums, int target) {
        int targetIndex = -1;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == target) {
                targetIndex = i;
            }
        }
        return targetIndex;
    }
    // Approach 2: Binary Search Method
    public static int search(int[] nums, int target) {
        int notFound = -1;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] == target) {
                return mid;
            }
            // Check if the target is within the left side
            if(nums[mid] >= nums[left]) {
                if(target <= nums[mid] && target >= nums[left]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                // Check if the target is within the right side
                if(target >= nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid + 1;
                }
            }
        }
        return notFound;
    }
}
