
/**
 * Andrew WIlomovsky
* Tester class
*/
public class DigitTester
{
    /**
    * Test function in other class based off what it creates 
    */
    public static void main(){
        int num = 123456789;
        int num2 = 15420;
        int num3 = 0;
        
        Digits d1 = new Digits(num);
        Digits d2 = new Digits(num2);
        Digits d3 = new Digits(num3);
        
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d1.isStrictlyIncreasing());
        System.out.println(d2.isStrictlyIncreasing());
        System.out.println(d3.isStrictlyIncreasing());
    }
}
