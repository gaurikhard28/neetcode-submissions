class Solution {
    public int[] countBits(int n) {
        int[] ans= new int[n+1];
        ans[0]=0;
        if(n==0)  return ans;
        for(int i=0;i<=n;i++){
            int count =0;
            int j=i;
            while(j>0){
                j=j&(j-1);
                count++;
            } 
            ans[i]=count;
        }
      return ans;
    }
}
