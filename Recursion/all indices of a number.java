
public class Solution {

	public static int[] allIndexes(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        int res[]=allIndexes( input, x,0);
        return res;
		
	}
    public static int[] allIndexes(int[] input,int x,int si)
    {
        if(si==input.length-1)
        {
            if(input[si]==x)
            {
            int arr[]=new int[1];
            arr[0]=si;
            return arr;
            }
            else
            {
            return new int[0];    
            }
        }
        int[] res = allIndexes(input,x,si+1);
        if(input[si]==x)
        {
            int finalRes[]=new int[res.length+1];
            finalRes[0]=si;
            for(int i=1;i<finalRes.length;i++)
            {
                finalRes[i]=res[i-1];
            }
            return finalRes;
        }
        else
        {
        return res;    
        }
    }
   
	
}
