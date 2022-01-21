public class solution {

	// Return the changed string
	public static String replace(String input){
		// Write your code here
        if(input.length()==2)
        {
            if(input.charAt(0)=='p' && input.charAt(1)=='i')
                return ""+3.14;
            else
                return input;
        }
        String res = replace(input.substring(1));
        if(input.charAt(0)=='p' && res.charAt(0)=='i')
        {
            return ""+3.14+res.substring(1);
        }
        else
        {
            return ""+input.charAt(0)+res;
        }
	}
}
