# 0747. Largest Number At Least Twice of Others

🔗 Problem Link:
https://leetcode.com/problems/largest-number-at-least-twice-of-others/description/

## 🚀 Approach
- Find largest element first
  - Store its index, and element
- Loop through
  - Return -1 if largest element is less than one of the twice of element
Return index;