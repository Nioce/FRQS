package HiddenWord2016;


/** */
public class HiddenWord
{
    
    /*** Makes the string*/
    String word;
    
    /*** makes the string public*/
    public HiddenWord(String word){
        this.word=word;
    }
    
    /*** Finds hint vs the line of string vs your string in the tester*/
    public String getHint(String guess){
        String result ="";
        for(int n = 0; word.length() > n; n++){
            if(word.charAt(n) == guess.charAt(n) ){
                result += word.charAt(n);
            }
            else if(word.indexOf(guess.charAt(n)) != -1){
                result += "+";
            }
            else{
                result += "*";
            }
        }
        return result; 
    }
}
