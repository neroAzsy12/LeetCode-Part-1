#include <iostream>
#include <string>
#include <unordered_map>
using namespace std;

class Solution {
    public:
        // Approach #1, when only taking the 26 letters of the english alphabet into account
        bool isAnagram(string s, string t) {
            if (s.length() != t.length()) {
                return false;
            }

            int letters[26] = {};

            for (int i = 0; i < s.length(); i++) {
                letters[s[i] - 'a']++;
                letters[t[i] - 'a']--;
            }

            for (int index = 0; index < 26; index++) {
                if (letters[index] != 0) {
                    return false;
                }
            }

            return true;
        }

        // Follow up: What if inputs contain Unicode Characters?
        bool isAnagram2(string s, string t) {
            if (s.length() != t.length()) {
                return false;
            }
            
            unordered_map<char, int> letters;

            for (int i = 0; i < s.length(); i++) {
                letters[s[i]]++;
                letters[t[i]]--;
            }

            // using auto, the compiler wil automatically iner that i is the iterator type for letters
            // and will set the appropriate type, without you needing to figure it out
            for (auto i = letters.begin(); i != letters.end(); i++) {
                if (i->second != 0) {
                    return false;
                }
            }

            return true;
        }
};