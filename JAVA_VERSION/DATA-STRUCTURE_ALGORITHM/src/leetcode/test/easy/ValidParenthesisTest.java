package leetcode.test.easy;

import leetcode.easy.ValidParentheses;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*
https://leetcode.com/problems/valid-parentheses/description/
20. Valid Parentheses
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.


Example 1:
Input: s = "()"
Output: true

Example 2:
Input: s = "()[]{}"
Output: true

Example 3:
Input: s = "(]"
Output: false
 */
class ValidParenthesisTest {

    private final ValidParentheses validParantheses;

    ValidParenthesisTest() {
        validParantheses = new ValidParentheses();
    }

    @Test
    void testIsValid1() {
        String s = "()[]{}";
        assertTrue(validParantheses.isValid(s));
    }

    @Test
    void testIsValid2() {
        String s = "(]";
        assertFalse(validParantheses.isValid(s));
    }

    @Test
    void testIsValid3() {
        String s = "}";
        assertFalse(validParantheses.isValid(s));
    }

    @Test
    void testIsValid4() {
        String s = "(";
        assertFalse(validParantheses.isValid(s));
    }

    @Test
    void testIsValid5() {
        String s = "[{()[]}()]";
        assertTrue(validParantheses.isValid(s));
    }
}