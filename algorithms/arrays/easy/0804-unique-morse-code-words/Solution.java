import java.util.*;
class Solution {
  private static final String[] MORSE = {
      ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---",
      "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-",
      "..-", "...-", ".--", "-..-", "-.--", "--.."
  };

  public int uniqueMorseRepresentations(String[] words) {
    if (words.length == 1)
      return 1;

    Set<String> set = new HashSet<>();

    for (String word : words) {
      StringBuilder sb = new StringBuilder();

      for (char c : word.toCharArray()) {
        sb.append(MORSE[c - 'a']);
      }

      set.add(sb.toString());
    }
    return set.size();
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.uniqueMorseRepresentations(
        new String[] {
            "gin", "zen", "gig", "msg"
        })); // 2
  }
}
