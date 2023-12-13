package leetcode.medium;

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
public class ContainerWithMostWater {

    public static void main(String[] args) {
        int[] height1 = {1,8,6,2,5,4,8,3,7};
        int[] height2 ={1,1};
        int[] height3 = {2,3,4,5,18,17,6};
        System.out.println(maxArea2(height1)); // 49
        System.out.println(maxArea2(height2)); // 1
        System.out.println(maxArea2(height3)); // 17
    }
    // Approach 1: Brute force method O(n^2)
    public static int maxArea(int[] height) {
        int maxArea = 0;
        for(int i=0; i<height.length; i++) {
            for(int j=i+1; j<height.length; j++) {
                int length = Math.min(height[i], height[j]);
                int width = (j - i);
                maxArea = Math.max(maxArea, length * width);
            }
        }
        return maxArea;
    }
    // Approach 2: Efficient way O(n)
    public static int maxArea2(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;
        while(left < right) {
            int length = Math.min(height[left], height[right]);
            int width = right - left;
            if(height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
            maxArea = Math.max(maxArea, length * width);
        }
        return maxArea;

    }
}
