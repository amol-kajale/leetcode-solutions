# 0766. Toeplitz Matrix

🔗 Problem Link:
https://leetcode.com/problems/toeplitz-matrix/description/


## Description:
A Toeplitz Matrix is the matrix of every diagonal from top-left to bottom-right has the same element.
e.g:
  { 1, 2, 3, 4 },
  { 5, 1, 2, 3 },
  { 9, 5, 1, 2 }

## 🚀 Approach
- Check for each row and column
  - If matrix[i][j] != matrix[i-1][j-1] return false
- Return true;