class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]); // Add actual value, not index
        }

        // Check size using .size()
        return set.size() != nums.length;
    }
}