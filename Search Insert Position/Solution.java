class Solution {
	// binary search approach
	// Time Complexity: O(log n) 
	public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        
        // do binary search to find the index in which the target value appears in
        while (left <= right) {
            int mid = (left + right) / 2;
        
            if (nums[mid] < target) {          // if target is greater, ignore left half
                left = mid + 1;
            } else if (nums[mid] > target) {   // if target is smaller, ignore right half
                right = mid - 1;
            } else {
                return mid;    // returns true if nums[mid] == target, the index (mid) is returned
            }
        }
        return left;    // left is the corresponding index in which target should appear in nums
    }
}