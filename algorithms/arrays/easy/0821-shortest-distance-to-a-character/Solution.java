class Solution {
  public int[] shortestToChar(String s, char c) {
    int n = s.length();
    int[] result = new int[n];

    int prev = -n; // initialize far left

    // Left to Right
    for (int i = 0; i < n; i++) {
      if (s.charAt(i) == c) {
        prev = i;
      }
      result[i] = i - prev;
    }

    prev = 2 * n; // initialize far right

    // Right to Left
    for (int i = n - 1; i >= 0; i--) {
      if (s.charAt(i) == c) {
        prev = i;
      }
      result[i] = Math.min(result[i], prev - i);
    }

    return result;
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    String s = "loveleetcode";
    char c = 'e';
    int[] result = solution.shortestToChar(s, c);
    for (int distance : result) {
      System.out.print(distance + " "); // Output: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]
    }
  }
}