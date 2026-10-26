class Solution {
    public boolean isHappy(int n) {

        while(n>9){
            int sum =0;
            while(n>0){
                sum=sum+ (int)Math.pow(n%10,2);
                n=n/10;

            }
            n=sum;
        }

        if(n==7||n==1)  return true;
        else return false;
    }
}
