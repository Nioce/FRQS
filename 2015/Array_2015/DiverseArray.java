/**
 * Andrew Wilomovsky
 * Class makes functions 
 */
import java.util.ArrayList;
import java.util.Arrays;
public class DiverseArray
{
    /**
     * Adds all the number in a row
     * @parm array[] 
     * @return int sum
     */
    public static int arraySum(int array [] ){
        int sum=0;
        for(int i=0; array.length>i; i++){
            sum+=array[i];
        }
        return sum;
    }
    
    /**
     * Adds all the number in a row for each collumn
     * @parm int array[][]
     * @return int[] sum
     */
    public static int[] rowSums(int[][] array){
        ArrayList<Integer> sumsrow = new ArrayList<Integer>();
        int countlength = 0;
        
        for(int row = 0; row<array.length; row++){
            sumsrow.add(arraySum(array[row]));
            countlength++;
        }
        
        int[] sum = new int[countlength];
        for(int i=0;sumsrow.size()>i;i++){
            sum[i] = sumsrow.get(i);
        }
        return sum;
    }
    
    /**
     * Checks if any of the sums of the arrays[][] are the same
     * @parm array1 int[][]
     * @return boolean
     */
    public static boolean isDiverse(int[][] array1){
        ArrayList<Integer> sumsrow = new ArrayList<Integer>();
        int sum[] = {};
        
        int[] sumarray1 = rowSums(array1);
        for(int i=0; sumarray1.length>i;i++){
            for(int x=1+i; sumarray1.length>x;x++){
                if(sumarray1[i]==sumarray1[x]){
                    return false;
                    
                }
            }
        }
        return true;
    }
}
