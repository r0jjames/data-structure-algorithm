package algorithm.common_problems.test;

import algorithm.common_problems.CommonProblems;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommonProblemsTest {

    @Test
    void countWordTest() {
        String sentence = "   This is a sample sentence to count words   "; // Example sentence
        int wordCount = CommonProblems.countWords(sentence);
        System.out.println("Number of words in the sentence: " + wordCount);
        assertEquals(8, wordCount);
    }

    @Test
    void maxSubArrayTest() {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4}; // Example array of numbers
        int maxSum = CommonProblems.maxSubarraySum(nums);
        assertEquals(6, maxSum);
        System.out.println("Maximum subarray sum: " + maxSum);
    }


}
