import java.util.ArrayList;

public class JadenCase {

    public static void main(String[] args){
        System.out.println( JadenCase.toJadenCase("hello my name is") );
    }

    public static String toJadenCase(String phrase) {

        ArrayList<Character>words = new ArrayList<Character>();
        ArrayList<Character>Cap = new ArrayList<Character>();
        ArrayList<Character>CapWords = new ArrayList<Character>();




        if (phrase == null || phrase =="") {
            return null;
        } else{

            for(char i: phrase.toCharArray()) {
                words.add(i);
            }
            int counter = 0;

            for(char c: words){
                if(c == ' '){
                    char word = Character.toUpperCase( Cap.get(0));
                    Cap.set(0, word);
                    CapWords.addAll(Cap);
                    CapWords.add(' ');
                    Cap.clear();
                    counter++;

                } else if (counter == words.size() -1){
                    Cap.add(c);
                    char word = Character.toUpperCase( Cap.get(0));
                    Cap.set(0, word);
                    CapWords.addAll(Cap);
                    Cap.clear();
                }else{
                    Cap.add(c);
                    counter++;

                }
            }

            String word = "";
            for(char letter : CapWords){
                word = word + letter;
            }
            return word;




        }


    }

}