class Solution {
    public int climbStairs(int n) {
    return climbStairs(n,0 , new HashMap<Integer,Integer>());     
    }
   public int climbStairs(int n,int currentStair,HashMap<Integer,Integer>memo)
   {
       if(currentStair==n)
           return 1;
       if(currentStair>n)
           return 0;
       int currentIndex = currentStair;
       if(memo.containsKey(currentIndex))
       {
           return memo.get(currentIndex);
       }
       int oneStep = climbStairs( n,currentStair+1,memo);
       int twoSteps = climbStairs( n,currentStair+2 , memo);
       memo.put(currentStair,oneStep+twoSteps);
       return oneStep + twoSteps;
   }
}
