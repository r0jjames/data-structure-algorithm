package leetcode.test.easy;

import leetcode.easy.ValidAnagram;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example 1:
Input: s = "anagram", t = "nagaram"
Output: true

Example 2:
Input: s = "rat", t = "car"
Output: false

 */
class ValidAnagramTest {
    private final ValidAnagram validAnagram;

    ValidAnagramTest() {
        validAnagram = new ValidAnagram();
    }
    @Test
    void validAnagramTest() {
        String s = "anagram";
        String t = "nagaram";
        assertTrue(validAnagram.isAnagram(s, t));
    }
    @Test
    void invalidAnagramTest() {
        String s = "rat";
        String t = "car";
        assertFalse(validAnagram.isAnagram(s, t));
    }
}
