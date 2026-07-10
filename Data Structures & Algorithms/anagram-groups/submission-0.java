class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm=new HashMap<>();
        for(int i=0;i<strs.length;i++){
           char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);

            String key = String.valueOf(arr);

// If the key is not in the map, put a new empty list
if (!hm.containsKey(key)) {
    hm.put(key, new ArrayList<>());
}


          hm.get(key).add(strs[i]);
        }
        List<List<String>> ar=new ArrayList<>();
        for(List<String> s : hm.values()){
            ar.add(s);
        }
        return ar;
    }
}
