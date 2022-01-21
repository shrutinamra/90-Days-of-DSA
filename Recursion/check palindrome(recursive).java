public class solution {

	public static boolean isStringPalindrome(String input) {
		// Write your code here
      //return isStringPalindrome(input,0);
        if(input.length()<=1)//in an even length string 1 length substring we can never get
            return true;
        if(input.charAt(0)==input.charAt(input.length()-1))
        {
            return isStringPalindrome(input.substring(1,input.length()-1));
        }
        else{
            return false;
            }
    
      }
    
  /*  public static boolean isStringPalindrome(String input,int si)
    {
        if(si==(input.length())/2)
        {
            if(input.length()%2==0)
            {
                if(input.charAt(si)==input.charAt(si-1))
                    return true;
                else
                    return false;
            }
            else
            {
                return true;
            }
                
        }
        
        boolean res = isStringPalindrome(input,si+1);
        if(res)
        {
            if(input.charAt(si)==input.charAt(input.length()-si-1))
                return true;
            else
                return false;
        }
        else
            return res;
    }*/
    

}
