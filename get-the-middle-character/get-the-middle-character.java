class Kata {
    public static String getMiddle(String word) {

        int len = word.length();

        if(len < 2){
            return word;
        } else if (len % 2 != 0){
            return ""+ word.charAt(len / 2);
        } else{
            return word.charAt(len / 2 -1) +""+ word.charAt(len / 2 );
        }


    }
}