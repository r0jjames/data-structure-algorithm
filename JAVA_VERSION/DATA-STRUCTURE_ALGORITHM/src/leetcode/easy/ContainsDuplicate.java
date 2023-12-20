package leetcode.easy;

import java.util.HashMap;
import java.util.HashSet;

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
