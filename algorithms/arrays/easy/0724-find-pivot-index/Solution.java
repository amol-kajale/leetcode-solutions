class Solution {
  public int pivotIndex(int[] nums) {
    int[] sumLeft = new int[nums.length];
    int[] sumRight = new int[nums.length];
    int total = 0;
    for (int num : nums) {
      total += num;
    }
    for (int i = 0; i < nums.length; i++) {
      sumLeft[i] = i > 0 ? sumLeft[i - 1] + nums[i - 1] : 0;
      sumRight[i] = total - sumLeft[i] - nums[i];
      if (sumLeft[i] == sumRight[i])
        return i;
    }

    return -1;
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.pivotIndex(
        new int[] {
            1, 7, 3, 6, 5, 6
        })); // 3
  }
}
