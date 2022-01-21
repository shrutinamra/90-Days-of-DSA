public class solution {

	public static int countZerosRec(int input){
        if(input==0)
        {
            return 1;
        }
        if(input<10)
        {
            if(input%10==0)
                return 1;
            else
                return 0;
        }
        int res = countZerosRec(input/10);
        if(input%10 == 0)
            return res+1;
        else 
            return res;
    }
}
