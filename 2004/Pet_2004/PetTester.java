import java.util.ArrayList;
/**
 * Andrew WIlomovsky
 * Tester class for all the animals
 */
public class PetTester
{
    /**
     * Test functions in other class
     * @parm args
     * @return voiddd
     */
    public static void main(String[] args){
        Pet p1 = new Dog("Rex");
        Pet p3 = new Dog("Lol");
        Pet p2 = new Cat("Bbb");
        Pet p4 = new LoudDog("Borjok");
        
        ArrayList<Pet> allPets = new ArrayList<Pet>();
        allPets.add(p1);
        allPets.add(p2);
        allPets.add(p3);
        allPets.add(p4);
        
        Kennel kennel = new Kennel(allPets);
        kennel.allSpeak();
    }
}