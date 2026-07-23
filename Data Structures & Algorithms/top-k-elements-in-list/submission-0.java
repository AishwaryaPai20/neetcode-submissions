class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Put the Map entries into a List
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        
        // Sort the list based on the frequency (Values) in descending order
        list.sort((a, b) -> b.getValue() - a.getValue());

        // Grab the top K keys
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = list.get(i).getKey();
        }
        return result;
    }
}