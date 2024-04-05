package leetcode.easy;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s0 = "reviver";
        String s1 =  "A man, a plan, a canal: Panama";
        String s2 = "race a car";
        String s3 = " ";
        System.out.println(isPalindrome2(s0)); // Truwe
        System.out.println(isPalindrome2(s1)); // True
        System.out.println(isPalindrome2(s2)); // False
        System.out.println(isPalindrome2(s3)); // True
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
    public static boolean isPalindrome2(String s) {
        int left = 0;
        int right = s.length() - 1;
        while(left < right) {
            char start = s.charAt(left);
            char end = s.charAt(right);

            if(!Character.isLetterOrDigit(start)) {
                left++;
                continue;
            }
            if(!Character.isLetterOrDigit(end)){
                right--;
                continue;
            }
            if(Character.toLowerCase(start) != Character.toLowerCase(end)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
