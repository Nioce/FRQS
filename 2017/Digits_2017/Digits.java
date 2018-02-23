import java.util.ArrayList;
/**
 * Andrew WIlomovsky
 \Class with all the code
 */
public class Digits
{
    private ArrayList<Integer> digitList;
    /**
     * Converts int into a array list and plugs it into the digit function.
     * @parm takes in int of numes
     * @return nothing  
     */
    public Digits(int num){
        digitList = new ArrayList<Integer>();
        
        String numsl = Integer.toString(num);
        int tnum = num;
        int whnum = num;
        for(int i = 0; numsl.length()>i;i++){
            if(num==0){
                digitList.add(0);
            }
            while(tnum > 10){
                tnum = tnum % 10;
            }
            digitList.add(0, new Integer(tnum));
            whnum= whnum/10;
            tnum=whnum;
        }
      
        /*
        if(num == 0){
           digitList.add(0);
        }
            
        while (num > 0) {
           digitList.add(0, num % 10);
           num /= 10;
        }
         */
       
    }
    
    /**
     * Sees if numbers in digit list are increasing
     * @parm nothing
     * @return true/false
     */
    public boolean isStrictlyIncreasing(){
        int count = 0;
        for(int i=0;digitList.size()-1>i;i++){
            if(digitList.get(i) < digitList.get(i+1)){
                count++;
            }
        }
        if(count==digitList.size() -1){
            return true;
        }
        return false;
    }
    public String toString() {
        return digitList.toString();
    }
}
