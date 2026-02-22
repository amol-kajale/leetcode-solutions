
class Solution {
  public boolean isToeplitzMatrix(int[][] matrix) {
    int rows = matrix.length;
    int cols = matrix[0].length;
    for (int i = 1; i < rows; i++) {
      for (int j = 1; j < cols; j++) {
        if (matrix[i][j] != matrix[i - 1][j - 1])
          return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.isToeplitzMatrix(
        new int[][] {
            { 1, 2, 3, 4 },
            { 5, 1, 2, 3 },
            { 9, 5, 1, 2 }
        })); // true
  }
}
