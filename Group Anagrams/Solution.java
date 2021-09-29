import java.util.*;
public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Maps the pairs <sorted-anagram-string, list of matching anagram(s)>
        HashMap<String, List<String>> anagrams_grouped = new HashMap<>();

        for (String s : strs) {             // iterate through all the strings in strs
            char[] alphabet = new char[26]; // char array, to keep track of each letter occurrence in the string

            for (char c : s.toCharArray()) {
                alphabet[c - 'a']++;        // increment the index position of the char, by 1
            }

            String key = new String(alphabet);                      // create a string based on the alphabet char array
            anagrams_grouped.putIfAbsent(key, new ArrayList<>());   // if the string of the sorted anagram is not in the map, add the string with a new ArrayList
            anagrams_grouped.get(key).add(s);                       // add the anagram to the corresponding sorted anagram key
        }

        List<List<String>> result = new ArrayList<>();  // will contain a list of grouped anagram(s) together

        for (List<String> words : anagrams_grouped.values()) {
            result.add(words);
        }
        return result;
    }   
}
