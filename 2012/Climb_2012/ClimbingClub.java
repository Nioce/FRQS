    import java.util.List; 
    import java.util.ArrayList;
    /**
     * Andrew Wilomovky
     * Mountian group class, adds peaks and does other stuff
     */
    public class ClimbingClub
    {
        private ArrayList<ClimbInfo> climbList;
        /**
         * Constructor makes arraylist
        */
        public ClimbingClub(){
            climbList = new ArrayList<ClimbInfo>() ;
        }
        
        /**
         * Adds climbs to list 
         * @parm String peakname, int climbTime
         * @return V O I D
         */
        public void addClimb(String peakname, int climbTime){
            ClimbInfo climb = new ClimbInfo(peakname, climbTime);
            for(int i=0;i<climbList.size();i++){
                if(peakname.compareTo(climbList.get(i).getName()) < 0){
                    climbList.add(i, climb);
                    break;
                }
            }
            if(climbList.size() == 0){
                climbList.add(climb);
            }
        }
    
         /** the number of distinct names in the list of climbs
          * @return int  */
         public int distinctPeakNames()
         {
             if (climbList.size() == 0){
             return 0;
             }
             
             ClimbInfo currInfo = climbList.get(0);
             String prevName = currInfo.getName();
             String currName = null;
             int numNames = 1;
             
             for (int k = 1; k < climbList.size(); k++)
             {
                 currInfo = climbList.get(k);
                 currName = currInfo.getName();
                 if (prevName.compareTo(currName) != 0){
                     numNames++;
                     prevName = currName;
                    }
             }
             return numNames;
         } 
         
         /**
          * To string function but with arrays
          * @return ArrayList<ClimbInfo>
          */
         public ArrayList<ClimbInfo> getList(){
             return climbList;
            }
    }

