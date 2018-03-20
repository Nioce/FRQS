
/**
 * Write a description of class tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class tester
{
    public static void main(String[] args){
        Vehicle subaru = new Vehicle(20000.00, 2500.00, 0.10);
        NoneTaxableItem kia = new NoneTaxableItem(14000, 1000);
        
        System.out.println(subaru.getListPrice());
        System.out.println(subaru.purachasePrice());
        System.out.println(subaru.markUp());
        System.out.println();
        subaru.changeMarkup(6000);
        System.out.println(subaru.purachasePrice());
        System.out.println(subaru.markUp());
        System.out.println();
        System.out.println(kia.purachasePrice());
        kia.changeMarkup(2000.00);
        System.out.println(kia.purachasePrice());
    }
}
