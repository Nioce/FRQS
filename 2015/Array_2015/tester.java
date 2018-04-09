/**
     *Andrew WIlomovsky
     * Test the functions In DiverseArray
     */
import java.util.Arrays;

public class tester
{
    /**
     * Test function 
     * @parm args
     */
   public static void main(String[] args){
      int[] arr1 = {1,3,2,7,3};
      
      int[][] array2d = {{1,3,2,7,3},
                         {10,9,5,2},
                         {5,6,2,7},
                         {5,6,23,7},
                         {5,6,2,7},
                         {7,37,2,6}};
                         
                         int[][] array3d = {{1,3,2,7,3},
                         {10,9,5,2},
                         {5,6,2,7},
                         {5,6,23,7},
                         {7,37,2,6}};
                         
      System.out.println(DiverseArray.arraySum(arr1));
      System.out.println(Arrays.toString(DiverseArray.rowSums(array2d)));
      System.out.println(DiverseArray.isDiverse(array2d));
      System.out.println();
      System.out.println(Arrays.toString(DiverseArray.rowSums(array3d)));
      System.out.println(DiverseArray.isDiverse(array3d));
      //
      //for(int[] rows: array2d){
      //    for(int col: rows){
      //        System.out.println(col);
      //      }
      //  }
    }
}