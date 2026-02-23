# 0806. Number of Lines To Write String

🔗 Problem Link:
https://leetcode.com/problems/number-of-lines-to-write-string/


## Description:


## 🚀 Approach
- Loop through each char
- Get width of each char
- Add it to totalPixel
- Check totalPixel > 100
  - Increase no of lines and re-assign totalPixel to current char width
- Return no of lines plus one and totalPixel. e.g [3,60]