class Solution {
    public int maxArea(int[] heights) {
       int left=0,right=heights.length-1;
       int max=0;
       while(left<right){
        // System.out.println(left+" "+right);
            max=Math.max(max,(right-left)*Math.min(heights[right],heights[left]));
            // System.out.println("max "+max+" "+((right-left)*Math.min(heights[right],heights[left])));
            if(heights[left]<=heights[right]){
                left++;
            }
            else
               {
                   right--;
                 }
       } 
       return max;
    }
}
