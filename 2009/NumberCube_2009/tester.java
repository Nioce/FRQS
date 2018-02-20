
/**
 * Write a description of class tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Arrays;

public class tester
{  
    /**
    * Gets int based off roles and name of cube
    * @parm nuber of tosses and name of cube
    * @return int[]
    */
    public static int[] getCubeTosses(NumberCube cube, int numTosses){
        int[] tosses = new int[numTosses];
        for (int i = 0; numTosses>i ; i++){
            tosses[i] = cube.toss(); 
            
        }
        return tosses;
    }
    
    /**
    * Finds longest int an a row 
    * @parm takes in int[] and checks how many are in a row
    * @return longest running int value
    */
    public static int getLongestRun(int[] values){
        int vs= values.length;
        int maxv = -1;
        int curentv = 1;
        for(int i=0; vs - 1 >i; i++){
            if(values[i] == values[i+1]){
                for(int n =i+1; vs > n; n++){
                    if(values[i] == values[n]){
                        curentv++;
                    }
                    else{
                        n =+ vs;
                    }
                }
            }
            if(maxv<curentv){
                maxv = curentv;
            }
            curentv = 1;
        }
        return maxv;
    }
    
    /**
     * Void main, tester for other class and functions above
     */
    public static void main(){
        
        NumberCube cube = new NumberCube();

        int[] vlrnt1 = {1,2,3,5,5,5,3,3,3,3};
        int[] vlrnt2 = {1,2,3,5,5,5,1,1,4,6,4,6,6,6,6,6,6,5,5,4};
        int[] vlrnt3 = {1,2,3,1,1,4,6,4,6,5,5,5,5,5,5,4};

        System.out.println(getLongestRun(vlrnt1));
        System.out.println(getLongestRun(vlrnt2));
        System.out.println(getLongestRun(vlrnt3));

        int[] tosses = getCubeTosses(cube, 6);
        System.out.println(Arrays.toString(tosses));
        System.out.println(getLongestRun(tosses));
    }
}
