package HiddenWord2016;


/*** Class file for the tester*/
public class Tester
{
    
    /*** Static method to test strings */
    public static void main(String[] args){
        
        /*** Test strings vs the other oens*/
        HiddenWord puzzle = new HiddenWord("HARPS");
        System.out.println(puzzle.getHint("AAAAA"));
        System.out.println(puzzle.getHint("HELLO"));
        System.out.println(puzzle.getHint("HEART"));
        System.out.println(puzzle.getHint("HARMS"));
        System.out.println(puzzle.getHint("HARPS"));
        
    }
}
