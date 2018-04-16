
/**
 * Andrew Wilomovsky
 * Trio class, puts food togther 
 */
public class Trio implements Menu
{
    private Sandwich sandwich;
    private Salad salad;
    private Drink drink;
    /**
     * Complier for trio class
     * @parm Sandwich sandwich, Salad salad, Drink drink
     */
    public Trio(Sandwich sandwich, Salad salad, Drink drink){
        this.sandwich =sandwich;
        this.salad = salad;
        this.drink = drink;
    }
    
    /**
     * Get name class for trio
     * @return String
     */
    public String getName(){
        return sandwich.getName() + "/" + salad.getName() + "/" + drink.getName() + " Trio";
    }
    
    /**
     * Get price for trio class, only adds the two highest ones.
     * @return double 
     */
    public double getPrice(){
        double total = 0.0;
        if(sandwich.getPrice() <= salad.getPrice() && sandwich.getPrice() <= drink.getPrice()){
            total = salad.getPrice() + drink.getPrice();
        }
        
        if(drink.getPrice() <= salad.getPrice() && drink.getPrice() <= sandwich.getPrice()){
            total = salad.getPrice() + sandwich.getPrice();
        }
        
        if(salad.getPrice() <= drink.getPrice() && salad.getPrice() <= sandwich.getPrice()){
            total = sandwich.getPrice() + drink.getPrice();
        }
        return total;
    }
}
