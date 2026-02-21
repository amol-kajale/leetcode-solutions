# 1. Two Sum

🔗 Problem Link:
https://leetcode.com/problems/palindrome-number/

## 🚀 Approach
- Return false for following condition
  - x < 0
  - X != 0 AND x % 10 == 0
- result = 0
- while
  - x > result
  - result = result * 10 + x % 10
  - result /= 10
- return x == result || x == result/10