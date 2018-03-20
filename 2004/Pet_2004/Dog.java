import java.util.ArrayList;
/**
 * Write a description of class Dog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dog extends Pet
{
    /**
     * Contructor for all regular dogos
     * @parm name
     * @return none
     */
    public Dog(String name){
        super(name);
    }
    
    /**
     * Speak method 
     * @parm  none
     * @return String 
     */
    public String speak(){
        return "bork";
    }
}
