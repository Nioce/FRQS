package apcs_array_test;


/**
 * Write a description of class College here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class College extends Object
{
    // instance variables - replace the example below with your own
    private int tuitionCost;
    private String name;
    private String region;
    public College(String name, String region, int tuitionCost){
        this.name = name;
        this.region = region;
        this.tuitionCost = tuitionCost;
    }
    /**Returns the name of the college*/
    public String getName(){
        return name;
    }
    /**Returns the Region of the college*/
    public String getRegion(){
        return region;
    }
    /**Returns the Tuition of the college*/
    public int getTuition(){
        return tuitionCost;
    }
    /**Sets/updates the Tuition of a college*/
    public void setTuition(int newTuition){
        tuitionCost = newTuition;
    }
    /**Returns the name of the college for the tester*/
    public String toString() {
        return "College[" + name + ", " + region + ", " + tuitionCost + "]";
    }
}
