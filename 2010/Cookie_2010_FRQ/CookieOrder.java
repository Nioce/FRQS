
/**
 * Andrew Wilomovsky
 * basic running class
 */
import java.util.Arrays;
import java.util.ArrayList;
public class CookieOrder
{

   private String variety;
   private int numboxes;
   /**
     * Makes a cookie box or a single cookie order
     * @parm  String Variety in numboxes 
     */
   public CookieOrder(String variety, int numboxes) {
       this.numboxes=numboxes;
       this.variety=variety;
   }
   
   /**
     * Gets the variety of the cookie order
     */
   public String getVariety(){
       return variety;
   }
   
   /**
     * Gets the number of boxes ordered
     */
   public int getNumBoxes(){
       return numboxes;
   }
   
   
}
