class Solution {
    public int lengthOfLongestSubstring(String s) {
        int slen=s.length();
       if(slen==0 ||slen==1){
            return slen;
        }
        int i=0, j=0;
        int count =1;
        int max=1;

        HashMap<Character,Integer> hm=new HashMap<>();
        hm.put(Character.valueOf(s.charAt(0)),1);
        while(j<slen-1){
            if(hm.containsKey(s.charAt(j+1))){
                count=j-i+1;
                hm.remove(s.charAt(i));
                i++;
            } 

            else{

                j++;
                hm.put(Character.valueOf(s.charAt(j)),1);
            }
            count=j-i+1;
            max=Math.max(max,count);
        }
        return max;
    }
}
