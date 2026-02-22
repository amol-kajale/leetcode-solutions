# 0697. Degree of an Array

🔗 Problem Link:
https://leetcode.com/problems/degree-of-an-array/

## 🚀 Approach
- Step 1: find the number which has maximum degree. Take below for example:
  - [1,2,2,4,3,4]
- Here degree is 2 for both 2 and 4. so now simply check the indexes:-
  - 2 starts from index 1 ends at 2.
  - 4 starts from index 3 ends at 5.

- Now whichever start and end index is small, thats the answer.
  - 5-3 = 2
  - 2-1 = 1

- return the minimum +1 from above.