import java.util.Random;
import java.util.ArrayList;
/**
 * Functions that run and return arguments
 * 
 *
 * @author Anbdrew Wilomovsky
 */
public class NumberCube
{   
    
    /**
    * Creates a cube
    */
    public NumberCube(){

    }
    
    /**
    * Creates random number for toss
    * @return random number for value 1-6
    */
    public int toss(){
        Random rand = new Random();

        int  n = rand.nextInt(6) + 1;
        return n;
    }

}
