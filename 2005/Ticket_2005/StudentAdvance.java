
/**
 * Andrew wilomovsky
 * Contains functions that gets price based off it being a student
 */
public class StudentAdvance extends Advance
{
    /**
     * Contructor, gets days from the other class
     * @pram days 
     */
    public StudentAdvance(int day){
        super(day);
    }
    
    /**
     * Gets the student price
     * @parm none
     * @return double
     */
    public double getPrice(){
        return (super.getPrice())/2;
    }
    
    /**
     * To string metho
     * @parm none
     * @return string
     */
    public String toString(){
        return super.toString() + " Student id needed";
    }
}
