package leetcode.medium;

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
