import java.util.List; 
import java.util.ArrayList;
/**
 * Andrew WIlomovsky
 * Tester class
 */
public class TesterThing
{
    public static void main(String[] args){
        ClimbingClub club = new ClimbingClub();
        

        club.addClimb("WhiteFace", 301);
        club.addClimb("Mondnock", 225);
        club.addClimb("Algoquin", 344);
        club.addClimb("Mondnock", 344);
        club.addClimb("Monaco", 462);
        System.out.println(club.getList());
        System.out.println(club.distinctPeakNames());
        club.getList();
        //club.getList();
        //ClimbingClub.getList();
        
    }
}
