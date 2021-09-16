class Solution {

    int res = Integer.MAX_VALUE;
    
    public int closestCost(int[] baseCosts, int[] toppingCosts, int target) {
        for(int base : baseCosts) {
            dfs(0, base, target, toppingCosts);
        }
        return res;
    }
    
    private void dfs(int cur, int cost, int target, int[] toppingCosts) {
        if(Math.abs(target - cost) < Math.abs(target - res)
           || Math.abs(target - cost) == Math.abs(target - res) && cost < res) {
            res = cost;
        }

        if(cost >= target) {
            return;
        }

        for(int i = cur; i < toppingCosts.length; i++) {
            dfs(i + 1, cost + toppingCosts[i], target, toppingCosts);
            dfs(i + 1, cost + 2 * toppingCosts[i], target, toppingCosts);
        }
    }
}