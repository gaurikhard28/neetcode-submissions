class Solution {
    public boolean canJump(int[] nums) {

        // for(i>0;i--){
            
        // }
        int j=nums.length-2;
        int i=nums.length-1;
        if(nums.length==2) return nums[j]+j>=i;
        while( j>=0){
            // System.out.println(i+" "+j);
             if(nums[j]+j>=i){
                
                i=j;
             }
             
                j--;
             
        }

        return i==0 || j==0;
    }
}
