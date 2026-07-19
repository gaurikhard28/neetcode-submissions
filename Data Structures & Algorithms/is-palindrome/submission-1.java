class Solution {
    public boolean isPalindrome(String st) {
        
        String s = st.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int  n=s.length();
        // System.out.print(s);
        if(n==1){
            return true;
        }
        for(int i=0;i<n/2;i++){
            if(s.charAt(i)!=s.charAt(n-i-1)){

                return false;
            }
        }
        return true;
    }
}
