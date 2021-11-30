class Solution {
    public int rob(int[] nums) { 
     return rob(nums,0,new HashMap<Integer,Integer>());
    }
    public int rob(int[]nums,int currentIndex,HashMap<Integer,Integer>memo)
    {
        if(currentIndex >= nums.length)
            return 0;
        int currentKey=currentIndex;
        if(memo.containsKey(currentKey))
            return memo.get(currentKey);
        int considered = nums[currentIndex] + rob(nums,currentIndex+2,memo);
        int notConsidered = rob(nums,currentIndex+1,memo);
        memo.put(currentKey,Math.max(considered,notConsidered));
        return Math.max(considered,notConsidered);
            
    }
    
}
