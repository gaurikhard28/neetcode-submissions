class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if (nums == null || nums.length == 0) return new int[0];
        PriorityQueue<Helper> pqMax = new PriorityQueue<>((a, b) -> Integer.compare(b.count, a.count));
        int count =1;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                pqMax.add(new Helper(nums[i-1],count));
                count=1;
            }
            else{
                count++;
            }
        }
         pqMax.add(new Helper(nums[nums.length - 1], count)); 
        int[] arr=new int[k];
        for(int i=0;i<k;i++){
           if (!pqMax.isEmpty()) {
                arr[i] = pqMax.poll().value; 
            }
        }
        return arr;
    }
}

class Helper{
    int value;
    int count;
    public Helper(int value, int count) {
        this.value = value;
        this.count = count;
    }

}
