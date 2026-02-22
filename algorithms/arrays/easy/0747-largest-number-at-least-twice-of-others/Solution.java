
class Solution {
  public int dominantIndex(int[] nums) {
    int largeNumber = Integer.MIN_VALUE;
    int index = -1;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > largeNumber) {
        largeNumber = nums[i];
        index = i;
      }
    }
    for (int i = 0; i < nums.length; i++) {
      if (largeNumber < (nums[i] * 2) && i != index)
        return -1;
    }
    return index;
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.dominantIndex(new int[] { 1, 2, 3, 6 })); // 3 -> 6
  }
}
