
/**
 * Andrew Wilomovsky
 * Drink class
 * 
 */
public class Drink implements Menu 
{
    
    private String drink;
    private double price;
    public Drink(String drink, double price){
        this.drink = drink;
        this.price = price;
    }
    
    public String getName(){
        return drink;
    }
    
    public double getPrice(){
        return price;
    }
}
