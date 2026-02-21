import java.util.*;

public class Solution {
  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int b = target - nums[i];
      if (map.containsKey(b) && ((nums[i] + b) == target)) {
        return new int[] { map.get(b), i };
      }
      map.put(nums[i], i);
    }
    return new int[] {};
  }
  
  public static void main(String[] args) {
    Solution solution = new Solution();
    int[] nums = { 2, 7, 11, 15 };
    int target = 9;
    int[] result = solution.twoSum(nums, target);
    System.out.println(Arrays.toString(result)); // Output: [0, 1]
  }
}