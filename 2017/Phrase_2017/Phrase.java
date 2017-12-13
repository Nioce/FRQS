package Phrase_2017;



/**
 * Compiler runs the code.
 */
public class Phrase
{
    /** Private
       makes variables */
    private String currentPhrase;
    
    /** Makes the variables public so other classes can use it */
    public Phrase(String p){
        currentPhrase = p;
    }
    
    /** Finds a letter or string place inside a string and  */
    public int findNthOccurence(String str, int n){
        int count = 0;
        int loc = currentPhrase.indexOf(str);
        while(loc > -1){
            count++;
            if(count==n){
                return loc;
            }
            loc = currentPhrase.indexOf(str, loc+1);
        }
        
        return -1;
    }
       
    /** Replaces the part of the string the the requested string */
    public void replaceNthOccurence(String str, int n, String rpl){
        String temp = "";
        String tempprev = "";
        int loc= findNthOccurence(str, n);
        if(loc !=-1){
            String before = currentPhrase.substring(0,loc);
            String after = currentPhrase.substring(loc+str.length(),currentPhrase.length());
            currentPhrase = before + rpl + after;
        }
    }
    
    /** Finds the last occurence of the string */
    public int findLastOccurence(String str){
        return currentPhrase.lastIndexOf(str);
    }
    
    /** Makes it so it can be printed. */
    public String toString(){
        return currentPhrase;}
}
