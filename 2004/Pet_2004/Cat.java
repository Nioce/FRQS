
/**
 * Write a description of class Cat here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cat extends Pet
{
    /**
     * Contructor for all catttos
     * @parm name
     * @return none
     */
    public Cat(String name){
        super(name);
    }
    
    /**
     * Speak method 
     * @parm  none
     * @return String 
     */
    public String speak(){
        return "Meow";
    }
}
