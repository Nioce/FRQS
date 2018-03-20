/**
* Andrew wilomovsky
* Class for nonetaxbale items, item subclass
*/
public class NoneTaxableItem implements Item
{
    private double cost;
    private double markup;
    
    /**
     *constructor method for class
     *@parm double cost, double markup
     *@return none
     */
    public NoneTaxableItem(double cost, double markup){
        this.cost=cost;
        this.markup=markup;
    }
    
    /**
     * Returns the cost for a none taxable item
     * @parm none
     * @return double 
     */
    public double purachasePrice(){
        return cost+markup;
    }
    
    /**
     * Changes the markup to a new value
     * @parm double newMarkup
     * @return none
     */
    public void changeMarkup(double newMarkUp){
        markup = newMarkUp;
    }
}
