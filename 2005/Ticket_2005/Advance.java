
/**
 * Andrew wilomovsky
 * Class contains functions that get price
 */
public class Advance extends Ticket 
{
   private int day;
   
   /**
    * Contructor 
     * @parm day
     * @return none
     */
   public Advance(int day){
       this.day=day;
   }
   
   /**
    * Gets cost based off days before event
     * @parm none
     * @return number
     */
   public double getPrice(){
       if(day > 10){
          return 30;  
       }
       return 40;

   }
}
