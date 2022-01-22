public class Solution {

	public static String removeConsecutiveDuplicates(String s) {
		// Write your code here
       if(s.length()==2)
       {
           if(s.charAt(0)==s.charAt(1))
           {
               return ""+s.charAt(0);
           }
           else
           {
               return s;
           }
       }
      String res = removeConsecutiveDuplicates(s.substring(1));
        if(s.charAt(0)==res.charAt(0))
            return res;
        else
            return ""+s.charAt(0)+res;
	}

}
