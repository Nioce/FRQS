package Phrase_2017;


/**
 * Test the phrase's and make occurnces
**/
public class Tester
{
    public static void main(String[] args){
        Phrase phrase1 = new Phrase("A cat ate late.");
        Phrase phrase2 = new Phrase("A cat ate late.");
        Phrase phrase3 = new Phrase("A cat ate late.");
        Phrase phrase4 = new Phrase("aaaa");
        Phrase phrase5 = new Phrase("aaaa");
        
        phrase1.replaceNthOccurence("at",1,"rane");
        System.out.println(phrase1);
        
        phrase2.replaceNthOccurence("at",6,"xx");
        System.out.println(phrase2);
        
        phrase3.replaceNthOccurence("bat",2,"xx");
        System.out.println(phrase3);
        
        phrase4.replaceNthOccurence("aa",1,"xx");
        System.out.println(phrase4);
        
        phrase5.replaceNthOccurence("aa",2,"bbb");
        System.out.println(phrase5);

      
        
    }
}
