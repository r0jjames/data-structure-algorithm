package leetcode.test.easy;

import leetcode.easy.ValidPalindrome;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {

    private final ValidPalindrome validPalindrome;

    ValidPalindromeTest() {
        validPalindrome = new ValidPalindrome();
    }

    @Test
    void testValidPalindrome1() {
        String s =  "A man, a plan, a canal: Panama";
        assertTrue(validPalindrome.isPalindrome(s));
    }

    @Test
    void testValidPalindrome2() {
        String s = "race a car";
        assertFalse(validPalindrome.isPalindrome(s));
    }
}