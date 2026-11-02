class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<ArrayList<Integer>> ar = new ArrayList<>();
        subsetsHelper(nums, 0, new ArrayList<>(), ar);
        return new ArrayList<>(ar);
        
    }
    public void subsetsHelper(int[] nums,int n,ArrayList<Integer> l,ArrayList<ArrayList<Integer>> ls) {
        if(n==nums.length){
            ls.add(new ArrayList<>(l));
            return;
        }
        l.add(nums[n]);
        subsetsHelper(nums,n+1,l,ls);
        l.remove(l.size()-1);
        subsetsHelper(nums,n+1,l,ls);
    }

}
