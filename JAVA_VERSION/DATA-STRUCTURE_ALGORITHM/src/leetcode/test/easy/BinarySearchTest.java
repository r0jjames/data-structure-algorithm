package leetcode.test.easy;

import leetcode.easy.BinarySearch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
https://leetcode.com/problems/binary-search/description/
Problem:
Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4

Example 2:
Input: nums = [-1,0,3,5,9,12], target = 2
Output: -1
Explanation: 2 does not exist in nums so return -1
 */
public class BinarySearchTest {
    private final BinarySearch binarySearch;
    BinarySearchTest() {
        binarySearch = new BinarySearch();
    }
    @Test
    void targetExistInIntegerNums() {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        int expectedOutput = 4;
        assertEquals(expectedOutput, binarySearch.search(nums, target));

    }
    @Test
    void targetNotExistInIntegerNums() {
        int[] nums = {-1,0,3,5,9,12};
        int target = 2;
        int expectedOutput = -1;
        assertEquals(expectedOutput, binarySearch.search(nums, target));
    }
}
