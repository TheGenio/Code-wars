import java.util.ArrayList;

public class DnaStrand {
    public static String makeComplement(String dna) {
        
        ArrayList<Character> Complement = new ArrayList<Character>();

        for (Character c : dna.toCharArray()) {
            switch (c) {

                case 'A': Complement.add('T');
                break;
                case 'T': Complement.add('A');
                    break;
                case 'G': Complement.add('C');
                    break;
                case 'C': Complement.add('G');
                    break;
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (Character ch : Complement) {
            stringBuilder.append(ch);
        }
        String resultString = stringBuilder.toString();
        return resultString;
        
        
        
        
        
    }
}