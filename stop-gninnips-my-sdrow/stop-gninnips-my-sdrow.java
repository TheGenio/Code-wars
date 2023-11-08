import java.util.ArrayList;
import java.util.Collections;

public class SpinWords{
    public String spinWords(String sentence) {

        StringBuilder sb = new StringBuilder();
        String[] test = sentence.split(" ");

        for(String i: test) {
            if (i.length() >=5){
                sb.append( new StringBuilder(i).reverse());

            }else{
                sb.append(i);
            }
            sb.append(" ");

        }

        return sb.toString().trim();
    }
}