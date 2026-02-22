import java.util.*;;

class Solution {
  public int findShortestSubArray(int[] nums) {
    Map<Integer, Integer> count = new HashMap<>();
    Map<Integer, Integer> firstIndex = new HashMap<>();
    int maxDegree = 0;
    int minLength = Integer.MAX_VALUE;
    for (int i = 0; i < nums.length; i++) {
      int num = nums[i];
      firstIndex.putIfAbsent(num, i);
      count.put(num, count.getOrDefault(num, 0) + 1);
      int feq = count.get(num);
      if (feq > maxDegree) {
        maxDegree = feq;
        minLength = i - firstIndex.get(num) + 1;
      } else if (feq == maxDegree) {
        minLength = Math.min(minLength, i - firstIndex.get(num) + 1);
      }

    }
    return minLength;
  }
  
    public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.findShortestSubArray(new int[]{1, 2, 2, 3, 1})); // 2
  }
}