class Solution {
    public int maxArea(int[] heights) {
        int max=0;
        int l=0;
        int r=heights.length-1;
        int area=0;
        while(l<r)
            {
                area= (r-l)*Math.min(heights[r],heights[l]);
                if(heights[l]>heights[r])
                {
                    r--;
                }
                else
                {
                    l++;
                }
                 max=Math.max(area,max);
            }
           
            return max;
        }
        
    }

