
/**
 *Andrew wilomovsky
 *Base pet class
 */

public abstract class Pet
{
    private String myName;
    /**
     * Contructor for all pets
     * @parm name
     * @return none
     */
    public Pet(String name){
        myName = name;
    }
    
    /**
     * Returns name for all pets
     * @parm none
     * @return string
     */
    public String getName(){
        return myName;
    }
    
    /**
     * Constructor for the speak method 
     * @parm none
     * @return string
     */
    public abstract String speak();
    
}
