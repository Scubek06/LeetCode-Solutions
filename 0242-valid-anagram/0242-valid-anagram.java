
import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> count = new HashMap<>();

        // Count characters in s
        for (char ch : s.toCharArray()) {
            if (count.containsKey(ch)) {
                count.put(ch, count.get(ch) + 1);
            } else {
                count.put(ch, 1);
            }
        }

        // Subtract characters in t
        for (char ch : t.toCharArray()) {
            if (!count.containsKey(ch)) {
                return false;
            }

            count.put(ch, count.get(ch) - 1);
        }

        // Check whether every count is 0
        for (char ch : count.keySet()) {
            if (count.get(ch) != 0) {
                return false;
            }
        }

        return true;
    }
}

