class Solution {
    public int characterReplacement(String s, int k) {
        int[] counts = new int[26];
        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            // Add current character to counts
            counts[s.charAt(right) - 'A']++;
            
            // Track the highest frequency character seen in the window
            maxFreq = Math.max(maxFreq, counts[s.charAt(right) - 'A']);

            // If (window size - max frequency) > k, the window is invalid
            while ((right - left + 1) - maxFreq > k) {
                counts[s.charAt(left) - 'A']--;
                left++;
            }

            // Update max valid window size
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}