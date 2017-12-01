package apcs_array_test;


/***Andrew Wilmovsky, base function*/
public class CollegeGroup
{
    /***Makes College an object*/
    private College[] myColleges;
    
    /***Makes College a public touchable object*/
    public CollegeGroup(College[] myColleges) {
        this.myColleges = myColleges;
    }
    
    /***Updates tuition*/
    public void updateTuition(String collegeName, int newTuition) {
        for(int n = 0; myColleges.length > n ; n++){
            if (collegeName.equals(myColleges[n].getName() ) ) {
                myColleges[n].setTuition( newTuition );
            }
        }
        System.out.println(newTuition);
    }
    
    /***Gets all of the colleges and prints the one the meet
       the criteria given
       */
    public College[] getCollegeList(String region, int low, int high){
        int amountTodo = 0;
        for(int n = 0; myColleges.length > n;n++){
            College c = myColleges[n];
            String r = c.getRegion();
            int t = c.getTuition();
            if( ( r.equals( region ) && (t > low) && (t < high ) )){
                amountTodo++;
            }
        }
        
        College [] bounds = new College[amountTodo];
        int where = 0;
        
        for(int n = 0; myColleges.length > n;n++){
            College c = myColleges[n];
            String r = c.getRegion();
            int t = c.getTuition();
            if( ( r.equals( region ) && (t > low) && (t < high ) )){
                bounds[where]=c;
                where++;
            }
        }
        return bounds;
    }
}
