class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        for (int num : nums) {
            if (!set.add(num)) {
                // If add() returns false, num is already in the set
                return true;
            }
        }
        
        return false;
    }
}
