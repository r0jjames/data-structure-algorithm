package leetcode.test.medium;

import leetcode.medium.MaximumProductSubarray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumProductSubarrayTest {

    private final MaximumProductSubarray maximumProductSubarray;

    MaximumProductSubarrayTest() {
        maximumProductSubarray = new MaximumProductSubarray();
    }

    @Test
    void testMaxProduct1() {
        int[] nums = {2, 3, -2, 4};
        assertEquals(6, maximumProductSubarray.maxProduct2(nums));
    }

    @Test
    void testMaxProduct2() {
        int[] nums = {-2, 0, -1};
        assertEquals(0, maximumProductSubarray.maxProduct2(nums));
    }

    @Test
    void testMaxProduct3() {
        int[] nums = {2, 3, -2, -5, 6, -1, 4};
        assertEquals(360, maximumProductSubarray.maxProduct2(nums));
    }

    @Test
    void testMaxProduct4() {
        int[] nums = {0, 0};
        assertEquals(0, maximumProductSubarray.maxProduct2(nums));
    }
}