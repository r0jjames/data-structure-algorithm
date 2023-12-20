package leetcode.easy;

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
