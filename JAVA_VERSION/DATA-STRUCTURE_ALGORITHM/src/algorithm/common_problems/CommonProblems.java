package algorithm.common_problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonProblems {
    public static void main(String[] args) {


        /*
        // Problem: Find the Longest Common Prefix
        String[] strs = {"flower", "flow", "floght"}; // Example array of strings
        String longestPrefix = longestCommonPrefix(strs); // flo
        System.out.println("Longest common prefix: " + longestPrefix);
         */

        /*
        Problem: Implement a Stack Using Arrays
        ArrayStack stack = new ArrayStack(5); // Create a stack with a maximum size of 5
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6); // Trying to push onto a full stack
        System.out.println("Top element of the stack: " + stack.peek());
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop(); // Trying to pop from an empty stack
        */

        /*
        // Problem: Detect Duplicate Elements in an Array
        int[] nums = {1, 2, 3, 4, 5, 2, 6, 7, 8, 3};
        hasDuplicateElements(nums); // Duplicates found in the array.
        */

        /*
        // Problem: Check if a String is Palindrome
        String str = "radar"; // Example string
        boolean isPalindrome = checkPalindrome(str);
        if (isPalindrome) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
        * /

         */
        /*
        // Problem: Find the Missing Number
        int[] nums = {3, 0, 1,2, 6, 4}; //
        int missing = findMissingNumber(nums);
        System.out.println("The missing number is: " + missing); // 5
        */

        // FizzBuzz(50); // Problem: FizzBuzz

        /*
        // Problem: Reverse a String
        String str = "Hello, world!";
        String reversed = reverseString(str);
        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + reversed); // Reversed string: !dlrow ,olleH
         */
    }

    public static int maxSubarraySum(int[] nums) {
        if (nums.length == 0 || nums == null) {
            return 0;
        }
        int maxSum = nums[0];
        int currSum = 0;

        for (int n: nums) {
            if (currSum <= 0) {
                currSum = 0; // reset if it's negative
            }
            currSum += n;
            maxSum = Math.max(currSum, maxSum);
        }
        return maxSum;
    }
    // Problem: Count Words in a Sentence
    public static int countWords(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return 0; // If the sentence is empty or null, return 0
        }
        String[] words = sentence.trim().split("\\s+"); // Split the sentence into words using whitespace as delimiter
        return words.length; // Return the number of words
    }
    // Problem: Find the Longest Common Prefix
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return ""; // If the array is empty or null, return an empty string
        }
        String prefix = strs[0]; // Initialize prefix with the first string in the array
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1); // Reduce prefix length until it matches
                if (prefix.isEmpty()) {
                    return ""; // If prefix becomes empty, return an empty string
                }
            }
        }
        return prefix; // Return the longest common prefix
    }
    private static boolean hasDuplicateElements(int[] elements) {
        boolean hasDuplicates = false;
        Set<Integer> set = new HashSet<>();
        for (int num: elements) {
            if (!set.add(num)) {
                hasDuplicates = true;
            }

        }
        if (hasDuplicates) {
            System.out.println("Duplicates found in the array.");
        } else {
            System.out.println("No duplicates found in the array.");
        }
        return hasDuplicates;
    }
    /*
        Problem: Check if a String is Palindrome
        Identify whether a given string (or number) reads the same backward as forward.
     */
    public static boolean checkPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            // Compare characters at left and right indices
            if (str.charAt(left) != str.charAt(right)) {
                return false; // If characters don't match, it's not a palindrome
            }
            // Move pointers towards the center
            left++;
            right--;
        }
        return true; // If all characters match, it's a palindrome
    }

    /*
    Problem: Find the Missing Number
    Given an array containing n distinct numbers taken from 0, 1, 2, …, n,
    find the one that is missing from the array.
    Note: Utilize the concept of arithmetic progression and Gauss’s formula
     */
    public static int findMissingNumber(int[] nums) {
        int n = nums.length;
        // Calculate the expected sum of numbers from 0 to n
        int expectedSum = n * (n + 1) / 2; // 6 * (6 + 1) / 2
        // Calculate the actual sum of numbers in the array
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        // The missing number is the difference between the expected sum and the actual sum
        return expectedSum - actualSum;
    }

    /*
    Problem: FizzBuzz
    For numbers divisible by 3, print "Fizz" instead of the number.
    For numbers divisible by 5, print "Buzz" instead of the number.
    For numbers divisible by both 3 and 5, print "FizzBuzz" instead of the number.
     */
    public static void FizzBuzz(int limit) {
        for (int i=1; i <= limit; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                    System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
    // Problem: Reverse a given string without using any built-in functions or libraries.
    public static String reverseString(String str) {
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            char leftTemp = chars[left];
            chars[left] = chars[right];
            chars[right] = leftTemp;
            left++;
            right--;
        }
        return new String(chars);

    }

}
