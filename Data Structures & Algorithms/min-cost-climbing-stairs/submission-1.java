class Solution {
    int min[];
    public int minCostClimbingStairs(int[] cost) {
        min = new int[cost.length + 1];
        Arrays.fill(min, -1);
        return minCost(cost, cost.length);
    }
    public int minCost(int[] cost, int n) {
        if (n == 0)
            return cost[0];
        if (n == 1)
            return cost[1];

        if (min[n] != -1)
            return min[n];

        if (n == cost.length) {
            return min[n]= Math.min(minCost(cost, n - 1), minCost(cost, n - 2));
        }

        return  min[n]= Math.min(minCost(cost, n - 1), minCost(cost, n - 2)) + cost[n];
    }
}
