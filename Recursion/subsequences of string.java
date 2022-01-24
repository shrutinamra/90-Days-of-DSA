import java.util.ArrayList;

class Solution {
    public static ArrayList<String> subsequences(String str) {
        // Write your code here
        if(str.length()==1)
        {
            ArrayList<String>res = new ArrayList<String>();
            res.add(str);
            return res;
        }
        ArrayList<String> smallAns = subsequences(str.substring(1));
        ArrayList<String> newRes = new ArrayList<String>();
        newRes.add(""+str.charAt(0));
        for(int i =0;i<smallAns.size();i++)
        {
            newRes.add(""+str.charAt(0)+smallAns.get(i));
        }
        for(int i = 0;i<smallAns.size();i++)
        {
            newRes.add(smallAns.get(i));
         }
        return newRes;
           
    }
}
