import java.util.*;
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }

        // sliding window approach
        int max_len =  1;   // max length of longest unique substring
        int start = 0;      // start index pointer
        int end = 1;        // end index pointer

        HashSet<Character> unique = new HashSet<>();    // to store if a char is already present or not
        unique.add(s.charAt(0));                        // add the first char to unique

        while (end < s.length()) {
            // if the char is in unique, remove from chars starting from start till the first occurence of the char
            if (unique.contains(s.charAt(end))) {
                int len = end - start;          // get the len of the substring
                
                if (len > max_len) {
                    max_len = len;              // assign to max_len if the len is bigger
                }

                unique.remove(s.charAt(start)); // remove the char at start index
                start++;                        // increment start index by 1
            } else {
                unique.add(s.charAt(end));      // add to unique, if char is not present
                end++;                          // increment end index by 1
            }
        }

        int len = end - start;  // calculate size after iteration
        if (len > max_len) {
            max_len = len;      // assign len to max_len if bigger
        }
        return max_len;         // return the longest substring of unique chars
    }
}