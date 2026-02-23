
class Solution {
  public int[] numberOfLines(int[] widths, String s) {
    char[] chars = s.toCharArray();
    int totalLines = 0;
    int totalPixel = 0;
    for (int i = 0; i < chars.length; i++) {
      int index = chars[i] - 'a';
      totalPixel += widths[index];
      if (totalPixel > 100) {
        totalLines += 1;
        totalPixel = widths[index];
      }
    }
    return new int[] { totalLines + 1, totalPixel };
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.numberOfLines(
        new int[] { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10,
            10, 10 },
        "abcdefghijklmnopqrstuvwxyz")); // [3, 60]
  }
}
