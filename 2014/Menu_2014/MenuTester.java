
/**
 * Andrew WIlomovsky
 * Tester class
 */
public class MenuTester
{
    /**
     * Tester class
     * @return args
     */
    public static void main(String[] args){
        Drink cap = new Drink("Cappuccino", 3.50);
        Drink orng = new Drink("Orange Soda ", 1.25);
        
        Salad spin = new Salad("Spinach Salad", 1.25);
        Salad col = new Salad("ColeSlaw", 1.25);
        
        Sandwich che = new Sandwich("Cheeseburger", 2.75);
        Sandwich club = new Sandwich("Club Sandwich", 2.75);
        
        Trio t1 = new Trio(club, col, cap);
        System.out.println(t1.getName());
        System.out.println(t1.getPrice());
    }
}
