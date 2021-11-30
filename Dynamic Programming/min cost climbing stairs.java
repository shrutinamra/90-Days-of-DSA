class Solution {
    public int minCostClimbingStairs(int[] cost) {
    // int min_cost_one = minCostClimbingStairs(cost,1,new HashMap<Integer,Integer>());
        HashMap<Integer,Integer>memo = new HashMap<Integer,Integer>();
     int min_cost_zero = minCostClimbingStairs(cost,0,memo);
        int min_cost_one = memo.get(1);
     return Math.min(min_cost_one,min_cost_zero);
    }
    public int minCostClimbingStairs(int[] cost, int currentIndex,HashMap<Integer,Integer>memo)
    {
        if(currentIndex == cost.length)
            return 0;
        if(currentIndex > cost.length)
            return 1000;
        int currentKey = currentIndex;
        if(memo.containsKey(currentKey))
            return memo.get(currentKey);
        int oneStep = cost[currentIndex]+minCostClimbingStairs(cost,currentIndex+1,memo);
        int twoSteps = cost[currentIndex]+minCostClimbingStairs(cost,currentIndex+2,memo);
        memo.put(currentKey,Math.min(oneStep,twoSteps));
        return Math.min(oneStep,twoSteps);
    }
}
