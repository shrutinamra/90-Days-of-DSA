public class solution {

	// Return the changed string
	public static String removeX(String input){
		// Write your code here
       if(input.length()==1)
       {
           if(input.charAt(0)=='x')
               return "";
           else
               return input;
       }
        String res = removeX(input.substring(1));
        if(input.charAt(0)=='x')
            return res;
        else
            return ""+input.charAt(0)+res;
      
        
	}
}
