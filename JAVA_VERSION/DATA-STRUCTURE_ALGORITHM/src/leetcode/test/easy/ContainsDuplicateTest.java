package leetcode.test.easy;

import leetcode.easy.ContainsDuplicate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*
https://leetcode.com/problems/contains-duplicate/description/
217. Contains Duplicate
Problem:
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
class ContainsDuplicateTest {

    private final ContainsDuplicate containsDuplicate;

    ContainsDuplicateTest() {
        containsDuplicate = new ContainsDuplicate();
    }

    @Test
    void testContainsDuplicate1() {
        int[] nums = {1, 2, 3, 1};
        assertTrue(containsDuplicate.containsDuplicate(nums));
    }

    @Test
    void testContainsDuplicate2() {
        int[] nums = {1, 2, 3, 4};
        assertFalse(containsDuplicate.containsDuplicate(nums));
    }

    @Test
    void testContainsDuplicate3() {
        int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        assertTrue(containsDuplicate.containsDuplicate(nums));
    }
}