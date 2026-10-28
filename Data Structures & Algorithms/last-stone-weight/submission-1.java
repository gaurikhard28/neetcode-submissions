class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (Integer stone : stones) queue.offer(stone);
        while (queue.size() > 1) {
            int x = queue.poll();
            int y = queue.poll();
            if (x == y) {
                continue;
            } else {
                queue.offer(x - y);
            }
        }
        if(queue.size()==0) return 0;
        return queue.poll();
    }
}
