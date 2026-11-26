class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        int min = 1;
        for (int i = 0; i < piles.length; i++) {
            max = Math.max(max, piles[i]);
        }

        while (max > min) {
            int mid = min + (max - min) / 2;
            if (help(piles, mid, h)) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }
        return min;
    }
    public boolean help(int[] piles, int speed, int t) {
        int sum = 0;
        for (int i = 0; i < piles.length; i++) {
            int an = piles[i] / speed + (piles[i] % speed == 0 ? 0 : 1);
            sum = sum + an;
        }
        return sum <= t;
    }
}
