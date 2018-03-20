
/**
 * Andrew WIlomovsky
 * Taxable item class, adds cost tax 
 */
public abstract class TaxableItem implements Item
{
    private double taxRates;
    /**
     * Constructor
     * @parm doulbe rate
     * @return none
     */
    public TaxableItem(double rate){
        taxRates = rate;
    }
    
    /**
     * Makes abstract method for getListPrice()
     * @parm none
     * @return double (when made in another class)
     */
    public abstract double getListPrice();  
    
    /**
     * The full price of a car or object
     * @parm none
     * @return double
     */
    public double purachasePrice(){
        return getListPrice() * (1.0 + taxRates);
    }
    
    
}
