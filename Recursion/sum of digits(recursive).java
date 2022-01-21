
public class solution {

	public static int sumOfDigits(int input){
		// Write your code here
     if(input <10)
         return input;
        int res = sumOfDigits(input/10);
        return input%10 + res;

	}
}
