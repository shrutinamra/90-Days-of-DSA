public class Solution {
	
	public static boolean checkNumber(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        boolean res = checkNumber(input,x,0);
        return res;
		
	}
    public static boolean checkNumber(int[] input,int x,int si)
    {
        if(si==input.length-1)
        {
            if(input[si]==x)
                return true;
            else
                return false;
        }
      if(input[si]==x)
          return true;
        return  checkNumber(input,x,si+1);
        
    }
    
}
