public class Solution {

	public static void print(int n){
		if(n==1)
        {
            System.out.print(1+" ");
            return;
        }
        print(n-1);
        System.out.print(n+" ");
        return;
	}

}
