class Solution {
  public char nextGreatestLetter(char[] letters, char target) {
    int targetCode = (int) target;
    for (char c : letters) {
      int letterCode = (int) c;
      if (letterCode > targetCode)
        return c;
    }
    return letters[0];
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.nextGreatestLetter(new char[] { 'c', 'f', 'j' }, 'a')); // 'c'
  }
}
