
public class solution {

	public static int multiplyTwoIntegers(int m, int n){
		if(n==1)
            return m;
        int smallAns = multiplyTwoIntegers(m,n-1);
        return smallAns+m;
        
	}
}
