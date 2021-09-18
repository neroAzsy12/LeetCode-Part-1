import java.util.*;
public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        } 
        int[] letters = new int[26];
        for (int i = 0; i < s.length(); i++) {
            letters[s.charAt(i) - 'a']++;
            letters[t.charAt(i) - 'a']--;
        }

        for (int val : letters) {
            if (val != 0) {
                return false;
            }
        }
        return true;
    }

    // Follow up: What if inputs contain Unicode Characters?
    public boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        HashMap<Character, Integer> letters = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            letters.put(s.charAt(i), letters.getOrDefault(s.charAt(i), 0) + 1);
            letters.put(t.charAt(i), letters.getOrDefault(t.charAt(i), 0) - 1);
        }

        for (int val : letters.values()) {
            if (val != 0) {
                return false;
            }
        }
        return true;
    }
}