 

import java.util.ArrayList;
/**
 * Andrew Wilomovsky
 * Gets Score and does some other smoll things
 */
public class StudentAnswerSheet
{
    /**
     * Converts Private objects to StudentAnswerSheet and makes it public
     * @parm takes in private objects 
     * @return objects and makes it public
     */
    private ArrayList<String> answers;
    private String name;
    public StudentAnswerSheet(String name, ArrayList<String> answers)
    {
        this.name=name;
        this.answers=answers;
    }
    
    /**
     * Returns name
     * @parm takes in name 
     * @return returns name of an AnswerSheet
     */
    public String getName(){
        return name;
    }
    
    /**
     * Gets score for singular answer Sheet
     * @parm takes a singular Student answersheet and a key 
     * @return the score based on answers given compared to the key
     */
    public double getScore(ArrayList<String> key){
        double score = 0.0;
        int right = 0;
        int question = 0;
        int wrong = 0;
        for(int i=0; answers.size()>i; i++){
            if(key.get(i).equals(answers.get(i))){
                score+= 1.0;
            }
            else if(answers.get(i).equals("?")){
                score+= 0.0;
            }
            else{
                score-=.25;
            }
        }
        return score;

    }
    
    
    
}
