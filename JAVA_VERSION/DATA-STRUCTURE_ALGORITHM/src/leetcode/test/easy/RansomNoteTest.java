package leetcode.test.easy;

import leetcode.easy.RansomNote;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


/*
https://leetcode.com/problems/ransom-note/
383. Ransom Note
Problem:
Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
Each letter in magazine can only be used once in ransomNote.

Example 1:
Input: ransomNote = "a", magazine = "b"
Output: false

Example 2:
Input: ransomNote = "aa", magazine = "ab"
Output: false

Example 3:
Input: ransomNote = "aa", magazine = "aab"
Output: true
 */
public class RansomNoteTest {
    private final RansomNote ransomNoteService;

    RansomNoteTest() {
        ransomNoteService = new RansomNote();
    }
    @Test
    void ransomNoteCanBeConstructed() {
        String ransomNote = "aa", magazine = "aab";
        assertTrue(ransomNoteService.canConstruct(ransomNote, magazine));
    }
    @Test
    void cannotBeConstructed1() {
        String ransomNote = "a", magazine = "b";
        assertFalse((ransomNoteService.canConstruct(ransomNote, magazine)));
    }
    @Test
    void cannotBeConstructed2() {
        String ransomNote = "aa", magazine = "ab";
        assertFalse((ransomNoteService.canConstruct(ransomNote, magazine)));
    }

}
