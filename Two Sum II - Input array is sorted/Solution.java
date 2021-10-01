public class Solution {
    // numbers is sorted, so we can use a two pointer approach to solve the problem
    // Time Complexity: O(n), Space Complexity O(n)
    public int[] twoSum(int[] numbers, int target) {
        int right = 0;                  // right pointer, starting from the begining of numbers, moves towards the end
        int left = numbers.length - 1;  // left pointer, starting from the end of numbers, moves towards the start
        int[] results = new int[2];     // int[] for containing the results of the problem
        
        while (right < left) {          // while the right pointer does not cross over the left pointer
            if (numbers[right] + numbers[left] > target) {         
                left--;     // decrease left pointer by 1, since the sum of both pointers is greater than the target
            } else if (numbers[right] + numbers[left] < target) {
                right++;    // increase right pointer by 1, since the sum of both pointer is smaller than the target
            } else {
                results[0] = right + 1; // store the value of the right pointer + 1 to results[0]
                results[1] = left + 1;  // store the value of the left pointer + 1 to results[1]
                return results;         // returns the indicies that make up the target sum
            }
        }
        
        return results; // if no solution, it'll return [0,0], which is the same as no solution
    }  
}
