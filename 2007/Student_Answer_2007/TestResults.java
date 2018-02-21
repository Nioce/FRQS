 

import java.util.ArrayList;
/**
 * Andrew WIlomovsky
 * Finds the highest score in all the answer sheets given 
 **/
public class TestResults
{
    /**
     * Groups StudentAnswerSheets to a list of sheets and makes it a public ent 
     * @parm takes a set of StudentAnswerSheets 
     */
    private ArrayList<StudentAnswerSheet> sheets;
    public TestResults(ArrayList<StudentAnswerSheet> sheets){
        this.sheets=sheets;
    }

    /**
     * Finds the highest scoring student in a stack of sheets
     * @parm a group of answer keys
     * @return tha name of highest scoring student
     */
    public String highestScoringStudent(ArrayList<String> key){
        double high = sheets.get(0).getScore(key);
        String name = sheets.get(0).getName();
        for(int i=0; sheets.size()>i; i++){
            StudentAnswerSheet s = sheets.get(i);
            double score = s.getScore(key);
            if(high<score){
                high=score;
                name= s.getName();
            }
        }
        return name;
    }
}
