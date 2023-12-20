package leetcode.test.medium;

import leetcode.medium.ContainerWithMostWater;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*
https://leetcode.com/problems/container-with-most-water/description/
11. Container With Most Water
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
Find two lines that together with the x-axis form a container, such that the container contains the most water.
Return the maximum amount of water a container can store.

Notice that you may not slant the container.
Example 1:
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

Example 2:
Input: height = [1,1]
Output: 1
 */
class ContainerWithMostWaterTest {

    private final ContainerWithMostWater containerWithMostWater;

    public ContainerWithMostWaterTest() {
        containerWithMostWater = new ContainerWithMostWater();
    }

    @Test
    void testMaxArea1() {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        assertEquals(49, containerWithMostWater.maxArea(height));
    }

    @Test
    void testMaxArea2() {
        int[] height = {1, 1};

        assertEquals(1, containerWithMostWater.maxArea(height));
    }

    @Test
    void testMaxArea3() {
        int[] height = {4, 3, 2, 1, 4};

        assertEquals(16, containerWithMostWater.maxArea(height));
    }

    @Test
    void testMaxArea4() {
        int[] height = {1, 2, 1};

        assertEquals(2, containerWithMostWater.maxArea(height));
    }
}