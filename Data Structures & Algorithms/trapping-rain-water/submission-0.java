class Solution {
    public int trap(int[] height) {
        if(height.length==0) return 0;
        int l=0,r=height.length-1;
        int rmax=0,lmax=0;
        int area=0;

        while(l<r){
             if(height[l]<=height[r]){
                lmax=Math.max(lmax,height[l]);
                area=area+lmax-height[l];
                l++;
             }
             else{

               rmax=Math.max(rmax,height[r]);
                area=area+rmax-height[r];
                r--;
             }
        }
        return area;
        
    }
}
