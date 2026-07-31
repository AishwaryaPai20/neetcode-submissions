class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        // Frequency of characters required by string t
        int[] isValidSub = new int[128];
        for (int i = 0; i < t.length(); i++) {
            isValidSub[t.charAt(i)]++;
        }

        int left = 0;
        int minLength = Integer.MAX_VALUE;
        int minStart = 0; 

        // Frequency of characters in our current window
        int[] countFreq = new int[128];

        for (int right = 0; right < s.length(); right++) {
            countFreq[s.charAt(right)]++;

            while (isValid(countFreq, isValidSub)) {

                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    minStart = left;
                }

                countFreq[s.charAt(left)]--;
                left++;
            }
        }

        return minLength == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLength);
    }

    private boolean isValid(int[] countFreq, int[] isValidSub) {
        for (int i = 0; i < 128; i++) {
            if (countFreq[i] < isValidSub[i]) {
                return false;
            }
        }
        return true;
    }
}