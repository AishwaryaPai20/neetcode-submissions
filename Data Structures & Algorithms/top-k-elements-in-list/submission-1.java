class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        // key  1 2 3
        //value 1 2 3

        List<Integer>[] buckets = new List[nums.length + 1];

        // bucket 0 1 2 3 4 5 6
        // value  0 1 2 3 0 0 0

        
        for (int key : count.keySet()) {  //[1,2,3]
            int frequency = count.get(key);
            if (buckets[frequency] == null) {
                buckets[frequency] = new ArrayList<>();
            }
            buckets[frequency].add(key);
        }

        int[] result = new int[k];
        int counter = 0;

        for(int i=buckets.length-1; i>=0 ; i--){
            if(buckets[i]!=null){
                for(int num: buckets[i]){
                    result[counter++] = num;

                    if(counter==k)
                        return result;
                }
            }
        }
        return result;

    }
}