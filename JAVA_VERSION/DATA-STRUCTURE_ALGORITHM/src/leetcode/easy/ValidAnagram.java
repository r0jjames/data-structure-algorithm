package leetcode.easy;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        /*
        1. Count the recurring of every S characters then stored in array
        2. Decrement every character in T from array[int]
        3. If S and T matches then return true else false
        4 Count = 0 // return true, Count != 0 return false means the character is different
         Check if S and T length matches

         */
        if(s.length() != t.length()) return false;
        // English Alphabet consist of 26 letters
        int[] count_chars = new int[26];

        for(int i=0; i<s.length(); i++) {
            count_chars[s.charAt(i)-'a']++;
            count_chars[t.charAt(i)-'a']--;
        }
        for(int c: count_chars) {
            if(c != 0) {
                return false;
            }
            System.out.println(c);
        }

        return true;
    }
}
