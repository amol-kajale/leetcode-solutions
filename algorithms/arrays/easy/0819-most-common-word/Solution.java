import java.util.*;

class Solution {
  public String mostCommonWord(String paragraph, String[] banned) {
    String[] para = paragraph.toLowerCase().replaceAll("[^a-z]", " ").split("\\s+");
    String mostFeqWorld = "";
    int count = 0;
    Map<String, Integer> map = new HashMap<>();
    Map<String, Boolean> bannedMap = new HashMap<>();
    for (String bannedS : banned) {
      bannedMap.put(bannedS, true);
    }
    for (String p : para) {
      if (!bannedMap.containsKey(p)) {
        map.put(p, map.getOrDefault(p, 0) + 1);
        int c = map.get(p);
        if (c > count) {
          count = c;
          mostFeqWorld = p;
        }
      }
    }
    return mostFeqWorld;
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.mostCommonWord(
        "Bob hit a ball, the hit BALL flew far after it was hit.",
        new String[] {
            "hit"
        })); // "ball"
  }
}