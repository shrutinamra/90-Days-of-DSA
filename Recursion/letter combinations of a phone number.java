class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0)
        {
           List<String>base=new ArrayList<String>();
           //base.add("");
            return base;
        }
        List<String>smallAns=letterCombinations(digits.substring(1));
        List<String>ans = new ArrayList<String>();
        String letters=keypad(Integer.parseInt(""+digits.charAt(0)));
        if(smallAns.size()==0)
        {
            for(int i=0;i<letters.length();i++)
            {
                ans.add(""+letters.charAt(i));
            }
        }
        else
        {
        for(int i=0;i<letters.length();i++)
        {
            for(int j=0;j<smallAns.size();j++)
            {
                ans.add(""+letters.charAt(i)+smallAns.get(j));
            }
        }
        }
        return ans;
       
    }
    public String keypad(int n)
    {
        HashMap<Integer,String>no_letter=new HashMap<Integer,String>();
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
        return no_letter.get(n);
    }
}
