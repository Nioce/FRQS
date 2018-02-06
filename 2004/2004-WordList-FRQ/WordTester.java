
/**
 * Andrew Wilomovsky 
 * Tester class
 * 
 */
import java.util.ArrayList;
public class WordTester
{
    /**
     * 
     * @parm test functions in other class
     * @returns runs functions in other class
     */
    public static void main(String[] args){
      ArrayList<String> list = new ArrayList<String>();
      list.add("cat");
      list.add("mouse");
      list.add("frog");
      list.add("dog");
      list.add("dog");
      
      WordList wl = new WordList(list);
      System.out.println(wl.numWordOfLength(3));
      System.out.println(wl.numWordOfLength(4));
      System.out.println(wl.numWordOfLength(2));
      wl.removeWordsOfLength(4);
      System.out.println(list);
      wl.removeWordsOfLength(3);
      System.out.println(list);
      wl.removeWordsOfLength(2);
      System.out.println(list);
   }
}
