class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {

        Map<Integer, List<int[]>> adj = new HashMap<>();

        for (int[] time : times) {
            adj.computeIfAbsent(time[0], x -> new ArrayList<>())
               .add(new int[]{time[1], time[2]});
        }

        Set<Integer> visited = new HashSet<>();

        PriorityQueue<int[]> minHeap = new PriorityQueue<>(
            (a, b) -> Integer.compare(a[0], b[0])
        );

        // Start from source node
        minHeap.offer(new int[]{0, k});

        int maxTime = 0;

        while (!minHeap.isEmpty()) {

            int[] curr = minHeap.poll();

            int dist = curr[0];
            int node = curr[1];

            if (visited.contains(node)) continue;

            visited.add(node);
            maxTime = Math.max(maxTime, dist);

            if (visited.size() == n) return maxTime;

            for (int[] edge : adj.getOrDefault(node, Collections.emptyList())) {
                if (!visited.contains(edge[0])) {
                    minHeap.offer(new int[]{
                        dist + edge[1],
                        edge[0]
                    });
                }
            }
        }

        return -1;
    }
}