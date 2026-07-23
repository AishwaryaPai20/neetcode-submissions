class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> grp = new HashMap<>();

        for(String s : strs){

            int[] count = new int[26];
            for(int i=0; i<s.length(); i++){
                count[s.charAt(i)-'a']++;
            }

            // act [1 0 1 0000000  1]

            String key = Arrays.toString(count);

            if(!grp.containsKey(key)){
                grp.put(key, new ArrayList<>());
            }

            grp.get(key).add(s);


        }
        return new ArrayList<>(grp.values());
        }
}