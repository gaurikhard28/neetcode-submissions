class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] productsuff = new int[n];
        int[] productprefix = new int[n];
        int[] ans = new int[n];
        productprefix[0]=nums[0];
        productsuff[n-1]=nums[n-1];
        for(int i=1;i<n;i++){
            productprefix[i]=productprefix[i-1]*nums[i];
        }
        for(int i=n-2;i>=0;i--){
            productsuff[i]=productsuff[i+1]*nums[i];
        }
        ans[0]=productsuff[1];
        ans[n-1]=productprefix[n-2];
        for(int i=1;i<n-1;i++){
            ans[i]=productprefix[i-1]*productsuff[i+1];
        }
        return ans;
    }
}  
