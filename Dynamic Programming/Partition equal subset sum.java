class Solution {
    public boolean canPartition(int[] nums) {
  int sum=0;
      for(int i=0;i<nums.length;i++)
      {
          sum+=nums[i];
      }
        if(sum%2==0)
            return canPartition(nums,0,sum/2,new HashMap<String,Boolean>());
        else
            return false;
    }
   public boolean canPartition(int[] nums , int currentIndex,int halfSum,HashMap<String,Boolean>memo)
   {
       if(halfSum==0)
           return true;
       if(currentIndex>=nums.length)
           return false;
       String currentKey=Integer.toString(currentIndex)+"_"+Integer.toString(halfSum);
       if(memo.containsKey(currentKey))
           return memo.get(currentKey);
       if(nums[currentIndex]<=halfSum)
       {
       boolean considered = canPartition(nums,currentIndex+1,halfSum-nums[currentIndex],memo);
           if(considered)
           {
               memo.put(currentKey,true);
               return true;
           }
        boolean notConsidered = canPartition(nums,currentIndex+1,halfSum,memo);
           memo.put(currentKey,considered||notConsidered);
           return considered || notConsidered;
       }
       else
       {
           boolean notConsidered =canPartition(nums,currentIndex+1,halfSum,memo);
           memo.put(currentKey,notConsidered);
           return notConsidered;
       }
   }
}
