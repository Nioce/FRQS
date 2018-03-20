
/**
 *Andrew wilomovsky
 * Dog class
 */
public class LoudDog extends Dog
{
    /**
     * Contructor for loud dogos
     * @parm name
     * @return none
     */
    public LoudDog(String name){
        super(name);
    }
    
    /**
     * Speak method 
     * @parm  none
     * @return String 
     */
    public String speak(){
        return super.speak() + " " + super.speak(); 
       
    }
}
