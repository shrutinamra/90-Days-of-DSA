public class Solution {

	public static int sum(int input[]) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        int res = sum(input,0);
        return res;
		
	}
    public static int sum(int[]input,int si)
    {
        if(si==input.length-1)
        return input[si];
        int res = sum(input,si+1);
        return res+input[si];
    
    }
}
