class Solution {
    public int findTargetSumWays(int[] nums, int target) {
    return findTargetSumWays(nums,target,0,new HashMap<String,Integer>());
    }
    public int findTargetSumWays(int[] nums,int target,int currentIndex,HashMap<String,Integer>memo)
    {
        if(target == 0 && currentIndex == nums.length)
            return 1;
        if(target!=0 && currentIndex >= nums.length)
            return 0;
        String currentKey = Integer.toString(currentIndex)+"_"+Integer.toString(target);
        if(memo.containsKey(currentKey))
            return memo.get(currentKey);
        int positive = findTargetSumWays(nums,target-nums[currentIndex],currentIndex+1,memo);
        int negative = findTargetSumWays(nums,target+nums[currentIndex],currentIndex+1,memo);
        memo.put(currentKey,positive+negative);
        return positive + negative;
    }
   
        
    
}
