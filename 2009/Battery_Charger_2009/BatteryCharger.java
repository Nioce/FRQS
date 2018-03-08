
/**
 *Andrew WIlomvosky
 *Functions Doc
 */
public class BatteryCharger
{
    /**
     * Makess private rate table and makes it public
     * @parm ratetable 
     */
    private int[] rateTable;
    public BatteryCharger(int [] rateTable){
        this.rateTable=rateTable;
    }
    
    /**
     * Gets the charge cost based off start hour and charge time 
     * @parm int Start hour and  int charge time  
     * @return int 
     */
    public int getChargingCost(int startHour, int chargeTime){
        int cost = 0;
        
        for(int i = 0; chargeTime > i; i++){
            cost+=rateTable[(startHour + i) % 24];
        }
        
        return cost;
    }
    
    /**
     * Gets the start hour of charge 
     * @parm int charge time  
     * @return int
     */
    public int getChargeStartTime(int chargeTime){
        int startTime= 0;
        for(int x = 1; rateTable.length> x; x++){
            if(getChargingCost(x, chargeTime) < getChargingCost(startTime, chargeTime)){
                startTime = x;
            }
        }
        return startTime;
    }
}
