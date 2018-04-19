
/**
 * Andrew WIlomvosky
 * Base climb class
 * 
 */
public class ClimbInfo
{
    private String peakName;
    private int climbTime;
    /**
     * Constructor for climb's
     * @parm String peakName, int climbTime 
     */
    public ClimbInfo(String peakName, int climbTime){
        this.peakName=peakName;
        this.climbTime=climbTime;
    }
    
    /**
     * Returns name
     * @return String 
     */
    public String getName(){
        return peakName;
    }
    
    /**
     * Gets time
     * @returns int
     */
    public int getTime(){
        return climbTime;
    }
    
    /**
     * To string function
     * @return String
     */
    public String toString(){
        return climbTime +" "+ peakName;
    }
}
