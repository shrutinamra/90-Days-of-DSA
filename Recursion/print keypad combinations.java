public class solution {

	public static void printKeypad(int input){
		// Write your code here
        printKeypad(input,"");
		
	}
    public static void printKeypad(int input,String ans)
    {
        if(input==0)
        {
            System.out.println(ans);
            return;
        }
        int digit = input % 10;
        String letters = helper(digit);
        for(int i =0;i<letters.length();i++)
        {
            printKeypad(input/10,letters.charAt(i)+ans);
        }
    }
    public static String helper(int digit)
    {
        String arr[] ={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        return arr[digit];
    }
}
