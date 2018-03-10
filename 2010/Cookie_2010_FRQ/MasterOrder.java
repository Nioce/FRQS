
/**
 * Andrew Wilomovsky
 * Puts orders togther and makes functions
 */
import java.util.Arrays;
import java.util.ArrayList;

public class MasterOrder
{
    private ArrayList<CookieOrder> orders;
    /**
     * Makes master order publuc
     */
    public MasterOrder() {
        orders = new ArrayList<CookieOrder>();
    }
    
    /**
     * Makes the ablility to add orders 
     * @parm CookieOrder
     */
    public void addOrder(CookieOrder theOrder){
        orders.add(theOrder);
    }
    
    /**
     * Gets total number of boxes
     * @return int
     */
    public int getTotalBoxes(){
        int total =0;
        for(int i=0; orders.size()>i; i++){
            total+= orders.get(i).getNumBoxes();
        }
        return total;
    }
    
    /**
     * Removes a certian type of cookie from the order and returns the number removed
     * @parm cookieVar
     * @return int
     */
    public int removeVariety(String cookieVar){
        int total = 0;
        for(int i=0; orders.size()>i; i++){
            if(orders.get(i).getVariety().equals(cookieVar)){
                total += orders.get(i).getNumBoxes();
                orders.remove(i);
                
            }
        }
        return total;
    }
}
