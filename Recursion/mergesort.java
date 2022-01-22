public class solution {

	public static void mergeSort(int[] input){
		// Write your code here
        mergeSort(0,input.length-1,input);
	}
   public static void mergeSort(int lowerIndex,int higherIndex,int[] input)
   {
       if(lowerIndex>=higherIndex)
       {
           return;
       }
       int mid = (higherIndex-lowerIndex)/2+lowerIndex;
       mergeSort(lowerIndex,mid,input);
       mergeSort(mid+1,higherIndex,input);
       merge(lowerIndex,higherIndex,mid,input);
   }
    public static void merge(int li,int hi,int mid,int[]input)
    {
        int i=0,j=0,k=li;
        int la[]=new int[mid+1-li];
        int ra[]=new int[hi-mid];
        for(int m=0;m<la.length;m++)
        {
            la[m]=input[m+li];
        }
        for(int m=0;m<ra.length;m++)
        {
            ra[m]=input[m+mid+1];
        }
        while(i<la.length && j<ra.length)
        {
            if(la[i]<=ra[j])
            {
                input[k]=la[i];
                i++;
            }
            else{
                input[k]=ra[j];
                j++;
            }
            k++;
        }
        while(i<la.length)
        {
            input[k]=la[i];
            i++;
            k++;
        }
        while(j<ra.length)
        {
            input[k]=ra[j];
            j++;
            k++;
        }
    }
    
    
}
