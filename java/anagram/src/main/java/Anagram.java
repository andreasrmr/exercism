import java.util.*;

public class Anagram{


    final String word;

    public Anagram(String word){
        this.word = word;
    }
     //tapper
    //patter går igennem
    //Fordi der er to "t"er i patter.
    //Bliver nød til at have et ord hvor jeg fjerner bogstaver enkeltvis og måske sammenligner længden?

    public List<String> match(List<String> list){
        //clone list
        List<String> newList = new ArrayList<>();
        newList.addAll(list);

         //conditions explained.
         //Remove all words with if not same length as final word || Remove all exactly matching words (case insensitive)
         newList.removeIf(n -> (n.length() != this.word.length()) || n.equalsIgnoreCase(word));




        for(char c : word.toCharArray()){
            //nedenstående statement virker ikke da det fjerne ord med dobbeltbogstaver.
            newList.removeIf(n -> n.matches("[^"+ String.valueOf(c).toLowerCase() + String.valueOf(c).toUpperCase()+"]"));

            //brug evt retainAll ?
        }

        return newList;
    }
}

