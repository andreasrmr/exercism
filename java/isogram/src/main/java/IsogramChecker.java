import java.util.HashSet;
import java.util.Set;

class IsogramChecker {

    boolean isIsogram(String phrase) {
        phrase = phrase.toLowerCase();
        phrase = phrase.replaceAll("[^a-z]", "");
        Set<Character> set = new HashSet<>();
        for(Character c : phrase.toCharArray()){
            if(!set.add(c)){
                return false;
            }
            else {
                set.add(c);
            }
        }
        return true;
    }

}
