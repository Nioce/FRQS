package Apsc_Trail;


/**
 * Andrew Wilomvsky
 * 
 * Makes the trail class
 */
public class Trail
{
   /**
    * Int's markers and makes it a public class
    */
   private int[] markers;
   
   public Trail(int[] markers) {
       this.markers = markers;
   }
   
   /**
    * Checks if its difficult by checking the diffrence less than 30
    */
   public boolean isDifficult() {
       int heightcount = 0;
       
       for(int n=0; n<markers.length-1; n++) {
           
           int diff = Math.abs(markers[n] - markers[n+1]);
           
           if(diff >= 30) {
                heightcount++;
           }
       }
       
       return heightcount >= 3;
   }
   
   /**
    * Gets the average of the variables
    */
   public boolean islevelTrailSegment(int start, int end) {
      int max = markers[0];
      int min = markers[0];
      
      for(int n  = start; n<=end; n++){
          if(max < markers[n]) { 
             max = markers[n];
          }
          else if(min > markers[n]) {
             min = markers[n];
          }
      }
      
      return max - min <= 10;
   }
   
}
