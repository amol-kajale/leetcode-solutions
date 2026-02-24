# 0724. Find Pivot Index

🔗 Problem Link:
https://leetcode.com/problems/find-pivot-index/


## Description:


## 🚀 Approach
- Find the total
- Loop through and store the leftSum and rightSum
  - sumLeft[i] =  i > 0 ? sumLeft[i - 1] + nums[i - 1] : 0
  - sumRight[i] = total - sumLeft[i] - nums[i]
  - check sumLeft[i] == sumRight[i] and return i
- Return -1