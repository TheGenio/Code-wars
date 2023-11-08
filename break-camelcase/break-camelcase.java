public class Solution {

    public static void main(String[] args) {

        System.out.println(camelCase("helloGenio"));
    }


    public static String camelCase(String input) {

        for (int i = 0; i < input.length(); i++){
            
            char temp = input.charAt(i);

            if (Character.isUpperCase(temp)){
                input = input.substring(0, i) + " " + input.substring(i, input.length());
                i++;
            }

        }
        return input;

    }
}