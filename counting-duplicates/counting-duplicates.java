import java.util.ArrayList;
import java.util.Collections;


public class CountingDuplicates {


    public static int duplicateCount(String text) { // make it so it checks if its a number then pass it to make it lower case

        ArrayList<Character> allChar = new ArrayList<>(); //create an array list to store the chars
        int duplicates = 0; //count for the duplicates

        for (int i = 0; i < text.length(); i++) { //this loop adds all the chars to the array list
            allChar.add(text.charAt(i));
        }
        ArrayList<Character> capChar = new ArrayList<>();

        for (int let = 0; let < allChar.size(); let++) { // this loop should check all the letters and make them uppercase
            if (Character.isLetter(allChar.get(let))) {
                capChar.add(Character.toUpperCase(allChar.get(let)));

            } else{capChar.add(allChar.get(let));}
        }

        for (int i = 0; i < capChar.size(); i++) { // gives me a char to count

            char letter = capChar.get(i);
            int count = 0;


            for (int j = i + 1; j < capChar.size(); j++) { // will count all instances and remove the letter
                if (letter == capChar.get(j)) {
                    count++;
                    break;
                }
            }


            if (count >= 1) {
                duplicates++;
                capChar.removeAll(Collections.singleton(letter));
                i--;
            }
        }
        return duplicates;
    }
}