package Self_Divisor_FRQ;


/** Andrew Wilomovsky Seld Divisor
   Public class with ways to test the code*/
public class SelfDivisor
{
    /** Test and finding the diviable amounts of each function  */
    public static boolean isSelfDivisor(int number){
        int statment = 0;
        int numbercopy = number;
        // mod % 10
        while(numbercopy>0){
            statment = numbercopy % 10;
            if (statment == 0){
                return false;
            }
            if(number % statment != 0 ){
                return false;
            }
            numbercopy = numbercopy / 10;
        }
        return true;
    }
    
    /** Finds each one from a starting point and how many to find  */
    public static int[] firstNumSelfDivisors(int start, int num){
        
        int[] listnums = new int[num];
        
        int found = 0;
        
        while(num>found){
            if(isSelfDivisor(start)){
                listnums[found] = start;
                found++;
            }
            start++;
        }
        
        return listnums;
    }

}
