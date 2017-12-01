package Apsc_Trail;


/**
 * Andrew Wilomovsky
 * Tester for the document
 */
public class TrailTester
{
    public static void main(String[] args){
        int[] elevations1 = {100, 150, 105, 120, 90, 80, 50, 75 ,75, 70, 80, 90, 100};
        
        Trail t1 = new Trail(elevations1);
        System.out.println(t1.isDifficult());
        System.out.println(t1.islevelTrailSegment(0,1));
    }
}
