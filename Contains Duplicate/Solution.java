class Solution {
    // time complexity: O(n)
    public boolean containsDuplicate(int[] nums) {
        int min = Integer.MAX_VALUE;    // will contain the lowest num from nums
        int max = Integer.MIN_VALUE;    // will contain the highest num from nums

        for (int num : nums) {
            if (num < min) {
                min = num;              // if num is less than min, update min
            }
            if (num > max) {
                max = num;              // if num is greater than max, update max
            }
        }

        boolean[] isVisited = new boolean[max - min + 1]; // boolean arr to keep track of nums that appear
        for (int num : nums) {
            if (isVisited[max - num]) {
                return true;    // return true, if isVisited[num] has already been visited before
            }
            isVisited[max - num] = true;    // assign the index of isVisited[max - num] to be true, since it is now visited
        }
        return false;           // return false, since there are no duplicate numbers in nums
    }
}