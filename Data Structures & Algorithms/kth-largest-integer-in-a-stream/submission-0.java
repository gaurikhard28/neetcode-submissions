class KthLargest {
    int k;
    private PriorityQueue<Integer> p;
    public KthLargest(int k, int[] nums) {
        this.k=k;
        p = new PriorityQueue<>();
        for(int num:nums){
            p.add(num);
             if (p.size() > k) {
                p.poll(); 
            }
        }
    }
    
    public int add(int val) {
         p.add(val);

         if (p.size() > k) {
            p.poll();
        }
         return p.peek();
    }
}
