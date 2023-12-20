package leetcode.easy;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()) return false;
        int[] alphabet_counter = new int[26];
        for(char m : magazine.toCharArray()) {
            alphabet_counter[m-'a']++;
        }
        for(char r: ransomNote.toCharArray()) {
            if(alphabet_counter[r-'a']== 0) return false;
            alphabet_counter[r-'a']--;
        }

        return true;
    }
}
