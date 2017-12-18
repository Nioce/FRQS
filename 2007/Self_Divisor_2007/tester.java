package Self_Divisor_FRQ;


/** Andrew Wilomovsky Seld Divisor
   Public tester class*/
public class tester
{
    /** Makes arugments to test, And prints them out based on the code in #SelfDivisor*/
    public static void main(String[] args){
        System.out.println(SelfDivisor.isSelfDivisor(45));
        System.out.println(SelfDivisor.isSelfDivisor(128));
        System.out.println(SelfDivisor.isSelfDivisor(100));
        
        int[] divisors = SelfDivisor.firstNumSelfDivisors(10, 3);
        for (int d: divisors) {
            System.out.println(d);
        }
    }
}