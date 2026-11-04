class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        
        List<List<Integer>> res = new ArrayList();
        Arrays.sort(nums);

        dfs(0, new ArrayList<>(), 0, nums, target, res);

        return res;
    }

    private void dfs(int currIdx, List<Integer> currPath, int currSum, int[] nums, int target, List<List<Integer>> res) {
        
        if (currSum == target) {
            List<Integer> currPathCopy = new ArrayList<>();
            currPathCopy.addAll(currPath);
            res.add(currPathCopy);
            return;
        }

         if (currSum > target) {
            return;
        }

        for (int i = currIdx; i < nums.length; i++ ) {
            currPath.add(nums[i]);

            dfs(i, currPath, currSum + nums[i], nums, target, res);

            // backtrack
            currPath.remove(currPath.size() - 1);
        }
    }

}