import java.util.Random;
/**
 * Andrew Wilomovsky
 * Base class 
 */
public abstract class Ticket
{
    /**
     * Constructor for serial number
     * @parm none
     * @return none
     */
    private int serialNumber;
    public Ticket(){
        serialNumber = getNextSerialNumber();
    }
    
    /**
     * Contructs a getPrice() method
     * @parm none
     * @return int (when made in another class)
     */
    public abstract double getPrice();
    
    /**
     * To string function
     * @parm nothing
     * @return String
     */
    public String toString(){
        return "Number : " + serialNumber + " \nPrice:" + getPrice();
    }
    
    /**
     * Gets a serial number
     * @parm none
     * @return int
     */
    private static int getNextSerialNumber(){
        Random rand = new Random();
        int  n = rand.nextInt(50) + 1;
        return n;
    }
}
