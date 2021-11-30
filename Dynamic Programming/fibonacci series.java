class Solution {
    public int fib(int n) {
         return fib(n,new HashMap<Integer,Integer>());
    }
    public int fib(int n ,HashMap<Integer,Integer>memo)
    {
        if(n==0 || n==1)
          return n;
        int currentKey = n;
        if(memo.containsKey(currentKey))
            return memo.get(currentKey);
        memo.put(currentKey,fib(n-1,memo)+fib(n-2,memo));
        return fib(n-1,memo) + fib(n-2,memo);
    }
