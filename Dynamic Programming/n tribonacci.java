class Solution {
    public int tribonacci(int n) {
        return ntribonacci(n,new HashMap<Integer,Integer>());
    }
    public int ntribonacci(int n,HashMap<Integer,Integer>memo)
    {
        if(n==0 || n==1 )
            return n;
        if(n==2)
            return 1;
        int currentKey = n;
        if(memo.containsKey(currentKey))
            return memo.get(currentKey);
        int res1 = ntribonacci(n-1,memo);
        int res2 = ntribonacci(n-2,memo);
        int res3 = ntribonacci(n-3,memo);
        memo.put(currentKey,res1+res2+res3);
        return res1+res2+res3;
    }
}
