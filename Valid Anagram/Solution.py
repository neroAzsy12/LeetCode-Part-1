from collections import defaultdict

class Solution:
    def isAnagram(self, s, t):
        if len(s) != len(t):
            return False

        letters = [0] * 26

        for i in range(len(s)):
            letters[ord(s[i]) - ord('a')] += 1
            letters[ord(t[i]) - ord('a')] -= 1

        for val in letters:
            if val != 0:
                return False    
        return True
    
    # Follow up: What if inputs contain Unicode Characters?
    def isAnagram2(self, s, t):
        if (len(s) != len(t)):
            return False
        
        letters = defaultdict(int)
        for i in range(len(s)):
            letters[s[i]] += 1
            letters[t[i]] -= 1

        for val in letters.values():
            if val != 0:
                return False
        
        return True

