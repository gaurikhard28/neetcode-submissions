class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        // int[] p = new int[n];
        // p[0]=prices[0];
        // for(int i=1;i<n;i++){
        //      p[i]=Math.min(p[i-1],prices[i]);
        // }
        int max=0;
        int min=prices[0];
        for(int i=0;i<n;i++)

        {
            min=Math.min(min,prices[i]);
            max=Math.max(max,prices[i]-min);
        }
       return max;
    }
}
