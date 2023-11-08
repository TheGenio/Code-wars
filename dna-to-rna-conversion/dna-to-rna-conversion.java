import java.util.ArrayList;

public class Bio {
    public String dnaToRna(String dna) {

        ArrayList<Character> Complement = new ArrayList<Character>();

        for(Character c : dna.toCharArray()) {

            if(c == 'T'){
                Complement.add('U');
            }else{
                Complement.add(c);
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (Character ch : Complement) {
            stringBuilder.append(ch);
        }
        String dnaNew = stringBuilder.toString();


        return dnaNew;  // Do your magic!
    }
}