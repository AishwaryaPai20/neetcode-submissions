class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (!set.add(num)) { 
                return true; // Duplicate found immediately
            }
        }

        return false; // All elements were unique
    }
}