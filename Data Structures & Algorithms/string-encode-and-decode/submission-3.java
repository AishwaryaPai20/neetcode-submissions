class Solution {

    public String encode(List<String> strs) {
        StringBuilder en = new StringBuilder();
        for(String str: strs){
            en.append(str).append("!%&");
        }
        return en.toString();
    }

    public List<String> decode(String str) {
        System.out.print(str);
        List<String> res = new ArrayList<>();
        if(str.isEmpty()) {
            System.out.println("first");
            return res;
        } else if(str.equals("!%&")) {
            System.out.println("second");
            res.add("");
            return res;
        }
        res = List.of(str.split("!%&"));
        return res;
    }
}

