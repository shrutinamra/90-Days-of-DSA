public class solution {

	// Return a string array that contains all the possible strings
	public static String[] keypad(int n){
		// Write your code here
        if(n==0 || n==1)
        {
            String [] base = {""};
            return base;
        }
        String[] smallAns = keypad(n/10);
        int digit = n%10;
        String letters = helper(digit);
        String[]res= new String[letters.length()*smallAns.length];
        int k=0;
        for(int i=0;i<letters.length();i++)
        {
            for(int j=0;j<smallAns.length;j++)
            {
                res[k]=smallAns[j]+letters.charAt(i);
                k++;
            }
        }
        return res;

	}
    public static String helper(int digit)
    {
//        HashMap<Integer,String>keypad_letters=new HashMap<In
      /*     HashMap<Integer,String>no_letter=new HashMap<Integer,String>();
        no_letter.put(0,"");
        no_letter.put(1,"");
        no_letter.put(2,"abc");
        no_letter.put(3,"def");
        no_letter.put(4,"ghi");
        no_letter.put(5,"jkl");
        no_letter.put(6,"mno");
        no_letter.put(7,"pqrs");
        no_letter.put(8,"tuv");
        no_letter.put(9,"wxyz");
        return no_letter.get(digit); */
        String arr[] ={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        return arr[digit];
    }
	
}
