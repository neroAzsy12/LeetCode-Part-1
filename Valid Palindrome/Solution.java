class Solution {
	// helper function
    public boolean isAlpha(char c) {
		// determine if char c is a lowercase alphabetical character
        if (c - 'a' >= 0 && c - 'a' <= 25) {
            return true;
        }
        
		// determin if char c is a numeric digit
        if (c - '0' >= 0 && c - '0' <= 9) {
            return true;
        }
        return false;	// char c is not a alphanumeric character
    }
    
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();	// convert all characters in s to lowercase chars
        
        int left = 0;				// left pointer, moves to the right of the string
        int right = s.length() - 1;	// right pointer, moves to the left of the string
        
        while (left < right) {
            if (isAlpha(s.charAt(left)) && isAlpha(s.charAt(right))) {
                if (s.charAt(left) != s.charAt(right)) {
                    return false;	// return false, string s is not a palindrome when only considering alphanumeric chars
                }
                left++;	// move both pointers, since they have matching alphanumeric chars
                right--;
            } else if (!isAlpha(s.charAt(left))) {
                left++;	// move the left pointer to the right, since its not a alphanumeric char
            } else if (!isAlpha(s.charAt(right))) {
                right--;// move the right pointer to the left, since its not a alphanumeric char
            }
        }
        
        return true;	// string s, is a palindrome when only considering the alphanumeric characters
    }
}