class Solution {
    public boolean repeatedSubstringPattern(String s) {

        for (int len = 1; len <= Math.floorDiv(s.length(), 2); len++) {

            if (s.length() % len != 0) {
                continue;
            }

            boolean matches = true;

            for (int i = 0; i < s.length(); i++) {

                if (s.charAt(i) != s.charAt(i % len)) {
                    matches = false;
                    break;
                }
            }

            if (matches) {
                return true;
            }
        }

        return false;
    }
}