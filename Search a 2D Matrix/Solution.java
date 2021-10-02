class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        
        int left = 0;
        int right = matrix.length - 1;
        
        while (left <= right) {
            int mid = (left + right) / 2;
        
            if (matrix[mid][0] < target) {
                left = mid + 1;
            } else if (matrix[mid][0] > target) {
                right = mid - 1;
            } else {
                return true;
            }
        }
        
        int row = right;
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
                    return true;
                }
            }
        }
        
        return false;
    }
}