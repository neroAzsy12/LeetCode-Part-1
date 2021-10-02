class Solution {
    // time complexity: O(log(nm)), since matrix is m x n
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        
        int left = 0;
        int right = matrix.length - 1;
        
        // do binary search to find the row in which the target value could potentially appear in
        while (left <= right) {
            int mid = (left + right) / 2;
        
            if (matrix[mid][0] < target) {          // if target is greater, ignore left half
                left = mid + 1;
            } else if (matrix[mid][0] > target) {   // if target is smaller, ignore right half
                right = mid - 1;
            } else {
                return true;    // returns true if matrix[mid][0] == target
            }
        }
        
        int row = right;    // row is initialized based on, which row target could potentially appear
        
        // do binary search to find if the target value appears in the row, that was found by doing binary search
        if (row >= 0 && row < matrix.length) {
            left = 0;
            right = matrix[0].length - 1;
            
            while (left <= right) {
                int mid = (left + right) / 2;
                
                if (matrix[row][mid] < target) {
                    left = mid + 1;
                } else if (matrix[row][mid] > target) {
                    right = mid - 1;
                } else {
                    return true;    // returns true if matrix[row][mid] == target
                }
            }
        }
        
        return false;   // returns false, since the matrix does not contain target
    }
}
