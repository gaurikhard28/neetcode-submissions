class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
             hs.add(nums[i]);

             }
             int max=0;
        for (int num :hs) {
            int counnt=1;
            if(!hs.contains(num-1)){
                
                while(hs.contains(num+counnt)){
                    counnt++;

                }
                
            }
            max = Math.max(max, counnt);
        }
        return max;
    }
}
