package leetcode.test.easy;

import leetcode.easy.ValidParentheses;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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