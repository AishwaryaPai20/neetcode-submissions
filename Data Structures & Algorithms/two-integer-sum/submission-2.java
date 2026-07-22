class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if the complement already exists in our map
            if (map.containsKey(complement)) {
                // Return indices: smaller index first as requested
                return new int[] { map.get(complement), i };
            }

            // Store the current number and its index
            map.put(nums[i], i);
        }

        return new int[] {}; // Fallback return statement
    }
}