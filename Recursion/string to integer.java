public class solution {

	public static int convertStringToInt(String input){
		// Write your code here
        if(input.length()==1)
            return Integer.parseInt(input);
        int res = convertStringToInt(input.substring(1));
       // int len = Integer.toString(res).length();//1099
        return (int)Math.pow(10,input.length()-1)*Character.getNumericValue(input.charAt(0)) + res;
	}
}
