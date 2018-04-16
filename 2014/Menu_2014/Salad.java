
/**
 * Andrew WIlomovsky
 * Salad class
 */
public  class Salad implements Menu 
{
    private String salad;
    private double price;
    public Salad(String salad, double price){
        this.salad = salad;
        this.price = price;
    }
    
    public String getName(){
        return salad;
    }
    
    public double getPrice(){
        return price;
    }
}
