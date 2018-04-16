
/**
 * Andrew WIlomovsky
 * Sandwich class
 */
public class Sandwich implements Menu 
{
    private String sandwich;
    private double price;
    public Sandwich(String sandwich, double price){
        this.sandwich = sandwich;
        this.price = price;
    }
    
    public String getName(){
        return sandwich;
    }
    
    public double getPrice(){
        return price;
    }
}
