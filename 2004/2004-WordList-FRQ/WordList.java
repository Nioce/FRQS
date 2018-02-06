
/**
 * Function class
 *
 * @Andrew Wilomovsky
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class WordList
{
    
    private ArrayList<String> myList;
    
    /**
     * Makes mylist public function 
     */
    public WordList(ArrayList list){
        
        myList = list;
    }
    
    /**
     * Counts the number of words in a list that match the length
     * @parm gets the length of a word in the list
     * @returns the number of words that match parm
     */
    public int numWordOfLength(int len){
        
        int count = 0;
        
        for(int i=0; myList.size()>i; i++){
            
            if(myList.get(i).length() == len){
                
                count++;
            }
        }
        return count;
    }
    
    /**
     * Counts the number of words in a list that match the length and removes them
     * @parm gets word that match the length given and removes them
     * @returns returns edited list based of parm 
     */
    public void removeWordsOfLength(int len){
        
        for(int i=myList.size()-1; i>=0; i--){
            
            if(myList.get(i).length() == len){
                
                myList.remove(i);
            }
        }
    }
}
