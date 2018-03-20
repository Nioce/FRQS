import java.util.ArrayList;
/**
* Andrew wilomovsky
* Kennel class for all pets
*/
public class Kennel
{
    private ArrayList<Pet> petList;
    /**
     * Contrcutor makes pets into a group
     * @parm ArrayList<pets>
     * @return none
     */
    public Kennel(ArrayList<Pet> petList){
        this.petList = petList;
    }
    
    /**
     * Makes all the animals speak
     * @parm none
     * @return V O I d
     */
    public void allSpeak(){
        for(Pet p : petList){
            System.out.println(p.getName() + ": " + p.speak());
        }
    }
}
