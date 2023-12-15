package leetcode.easy;
/*
https://leetcode.com/problems/valid-palindrome/description/
125. Valid Palindrome

A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

Example 2:
Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.

Example 3:
Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.


Constraints:

1 <= s.length <= 2 * 105
s consists only of printable ASCII characters.
 */
public class ValidPalindrome {
    public static void main(String[] args) {
        String s1 =  "A man, a plan, a canal: Panama";
        String s2 = "race a car";
        String s3 = " ";
//        System.out.println(s1.replaceAll("[^a-zA-Z0-9]", ""));
        System.out.println(isPalindrome(s1)); // True
        System.out.println(isPalindrome(s2)); // False
        System.out.println(isPalindrome(s3)); // True
    }
    public static boolean isPalindrome(String s) {
        String temp = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = temp.length() - 1;
        while(left < right) {
            if(temp.charAt(left) == temp.charAt(right)) {
                left++;
                right--;
            } else {
                return false;
            }
        }

        return true;
    }
}
