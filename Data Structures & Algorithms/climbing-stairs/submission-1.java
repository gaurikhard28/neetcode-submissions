class Solution {
    int[] arr;
    public int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        arr =new int[n];

        return climb(n);
    }
    public int climb(int n) {
         if (n == 0 || n == 1) {
            return 1;
        }
        if(arr[n-1]!=0) return arr[n-1];

        arr[n-1]=climb(n-1)+climb(n-2);
        return arr[n-1];

    }
   
}
