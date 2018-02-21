/*** 
 * Andrew Wilomovsky
 * Tester class*/
import java.util.ArrayList;
public class Tester
{
    /**
     * Converts ArrayString to arraylist
     * @parm takes arraystring 
     * @return returns array list
     */
    public static ArrayList<String> toArrayList(String[] values) {
        ArrayList<String> result = new ArrayList<String>();
        
        for (String v: values) {
            result.add(v);
        }
        
        return result;
    }
    
    /**
     * Test functions in other class
     * @pram string's for tester
     * @return's the results from sheets in the functions using the functions in the other class
     */
    public static void main(String[] tester){
        ArrayList<String> bobsAnswers = new ArrayList<String>();
        
        bobsAnswers.add("A");
        bobsAnswers.add("B");
        bobsAnswers.add("D");
        bobsAnswers.add("E");
        bobsAnswers.add("A");
        bobsAnswers.add("C");
        bobsAnswers.add("?");
        bobsAnswers.add("B");
        bobsAnswers.add("D");
        bobsAnswers.add("C");
        StudentAnswerSheet s1 = new StudentAnswerSheet("Bob", bobsAnswers); 
        
        String[] sue = {"A", "B", "C", "?"};
        String[] sebas = {"A", "B", "C", "?","B", "C", "?"};
        String[] Lober = {"A","C","D","E","B","C","E","B","D"};
        String[] Calli = {"A","C","D","E","B","C","E","A","A"};
        ArrayList<String> suesAnswers = toArrayList(sue);
        ArrayList<String> sebasAnswers = toArrayList(sebas);
        ArrayList<String> loberAnswers = toArrayList(Lober);
        ArrayList<String> calliAnswers = toArrayList(Calli);
        
        StudentAnswerSheet s5 = new StudentAnswerSheet("Sebas", sebasAnswers); 
        StudentAnswerSheet s4 = new StudentAnswerSheet("Lober", loberAnswers); 
        StudentAnswerSheet s3 = new StudentAnswerSheet("Calli", calliAnswers); 
        StudentAnswerSheet s2 = new StudentAnswerSheet("Sue", suesAnswers); 
        
        ArrayList<String> key = new ArrayList<String>();
        key.add("A");
        key.add("C");
        key.add("D");
        key.add("E");
        key.add("B");
        key.add("C");
        key.add("E");
        key.add("B");
        key.add("B");
        key.add("C");
        
        
        ArrayList<StudentAnswerSheet> allSheets = new ArrayList<StudentAnswerSheet>();
        allSheets.add(s1);
        allSheets.add(s2);
        allSheets.add(s3);
        allSheets.add(s4);
        allSheets.add(s5);
        
        TestResults results = new TestResults(allSheets);
        
        System.out.println(s1.getScore(key));
        System.out.println(results.highestScoringStudent(key));
    }
}
