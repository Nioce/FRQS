
/**
 *Andrew Wilomovsky tester class
 */
public class tester{
    /**
     * Test function in other doc based off inputed numbers
     */
    public static void main(String[] args){
        
        int[] rates = {50,60,160,60,80,100,100,120,150,150,150,200,40,240,220,220,200,200,180
        ,180,140,100,80,60};
        BatteryCharger r1 = new BatteryCharger(rates);
        System.out.println(r1.getChargingCost(12,1));
        System.out.println(r1.getChargingCost(0,2));
        System.out.println(r1.getChargingCost(22,7));
        System.out.println(r1.getChargingCost(22,30));
        System.out.println();
        System.out.println(r1.getChargeStartTime(1));
        System.out.println(r1.getChargeStartTime(2));
        System.out.println(r1.getChargeStartTime(7));
        System.out.println(r1.getChargeStartTime(30));
        
    }
}