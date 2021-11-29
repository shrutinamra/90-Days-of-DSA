class Solution 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
         // your code here 
       return knapSack(W,wt,val,n,0,new HashMap<String,Integer>());
    } 
    static int knapSack(int w,int wt[],int val[],int n, int currentIndex,HashMap<String,Integer>memo)
    {
        if(w==0 || currentIndex>=n)
        return 0;
        String currentKey = Integer.toString(currentIndex)+"_"+Integer.toString(w);
        if(memo.containsKey(currentKey))
        return memo.get(currentKey);
        if(wt[currentIndex]<=w)
        {
            int considered = val[currentIndex] + knapSack(w-wt[currentIndex],wt,val,n,currentIndex+1,memo);
            int notConsidered = knapSack(w,wt,val,n,currentIndex+1,memo);
            memo.put(currentKey,Math.max(considered,notConsidered));
            return Math.max(considered,notConsidered);
        }
        else
        {
            int notConsidered = knapSack(w,wt,val,n,currentIndex+1,memo);
            memo.put(currentKey,notConsidered);
            return notConsidered;
        }
    }
    
}
