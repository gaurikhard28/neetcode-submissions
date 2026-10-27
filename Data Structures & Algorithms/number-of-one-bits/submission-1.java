// class Solution {
//     public int hammingWeight(int n) {
//         int ans=0;
//         while(n>0){
//              if(n%2==1){
//                 ans++;
//              }
//              n=n/2;
//         }
//         return ans;
//     }
// }

//optimised
class Solution {
    public int hammingWeight(int n) {
      int res = 0;
        for (int i = 0; i < 32; i++) {
            if ((1 << i & n) != 0) {
                res++;
            }
        }
        return res;  
    }
}

