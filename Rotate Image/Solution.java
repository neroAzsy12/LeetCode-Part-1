public class Solution {
    // rotating an n x n 2D matrix by 90 degrees
    public void rotate(int[][] matrix) {
        // Transpose the matrix first
        for(int row = 0; row < matrix[0].length; row++) {
            for (int column = row + 1; column < matrix.length; column++) {
                int tmp = matrix[row][column];
                matrix[row][column] = matrix[column][row];
                matrix[column][row] = tmp;
            }
        }

        // reverse the matrix after transposing
        for(int row = 0; row < matrix[0].length; row++) {
            for (int column = 0; column < matrix.length / 2; column++) {
                int tmp = matrix[row][column];
                matrix[row][column] = matrix[row][matrix[0].length - 1 - column];
                matrix[row][matrix[0].length - 1 - column] = tmp;
            }
        }
    }    
}