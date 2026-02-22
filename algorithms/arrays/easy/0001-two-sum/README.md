# 0001. Two Sum

🔗 Problem Link:
https://leetcode.com/problems/two-sum/

## 🚀 Approach
- We know the target element
- We can make use of c = a + b
  - c = target, a = current array element
  - Then we need to find b, b = c - a
  - b is the value we need to find and return index of it
- Check target == a + b And a in Map
  - if valid, return map index, and i
  - else store current element with its index in map.