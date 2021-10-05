import java.util.*;
class Solution {
	// time complexity: O(n)
	public boolean isValid(String s) {
        	Stack<Character> chars = new Stack<Character>();	// use a stack for LIFO order
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			switch(c) {
				case '(':
				case '{':
				case '[':
					chars.add(c);		// add the open parentheses to the stack chars
					break;
				
				case ')':
					if(chars.isEmpty() || chars.pop() != '(')	
						return false;	// if the last char added to chars is not the open paren, or is empty return false
					break;
				
				case '}':
					if(chars.isEmpty() || chars.pop() != '{') 
						return false;	// if the last char added to chars is not the open braket, or is empty return false
					break;
				
				case ']':
					if(chars.isEmpty() || chars.pop() != '[')
						return false;	// if the last char added to chars is not the open braket, or is empty return false
					break;
			}
		}
		
		return chars.isEmpty();	// if chars is empty, string s is a valid string of parentheses, else it is not valid format
    }
}
