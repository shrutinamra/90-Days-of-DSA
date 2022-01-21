public class Solution {

	public static int lastIndex(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        int res = lastIndex(input,x,0);
        return res;
	}
    public static int lastIndex(int[] input,int x,int si)
    {
        if(si>=input.length-1)
        {
            if(input[si]==x)
                return si;
            else
                return -1;
        }
        int index = lastIndex(input,x,si+1);
        if(index!=-1)
        {
            return index;
        }
        else
        {
            if(input[si]==x)
                return si;
            else
                return -1;
        }
    }
	
}
