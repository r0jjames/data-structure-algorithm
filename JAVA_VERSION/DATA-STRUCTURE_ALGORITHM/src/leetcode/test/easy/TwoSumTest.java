package leetcode.test.easy;

import leetcode.easy.TwoSum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    private TwoSum twoSum = new TwoSum();

    @Test
    void twoSum1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] res = twoSum.twoSumHashing(nums, target);
        assertEquals(target, nums[res[0]] + nums[res[1]]);

        res = twoSum.twoSumBruteForce(nums, target);
        assertEquals(target, nums[res[0]] + nums[res[1]]);

        res = twoSum.twoSumSorting(nums, target);
        assertEquals(target, nums[res[0]] + nums[res[1]]);
    }

    @Test
    void twoSum2() {
        int[] nums = {3, 2, 4};
        int target = 6;

        int[] res = twoSum.twoSumHashing(nums, target);
        assertEquals(target, nums[res[0]] + nums[res[1]]);

        res = twoSum.twoSumBruteForce(nums, target);
        assertEquals(target, nums[res[0]] + nums[res[1]]);

        res = twoSum.twoSumSorting(nums, target);
        assertEquals(target, nums[res[0]] + nums[res[1]]);
    }
}