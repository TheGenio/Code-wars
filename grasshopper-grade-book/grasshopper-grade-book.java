public class GrassHopper {

    public static char getGrade(int s1, int s2, int s3) {

        double avrage = (double) (s1 + s2 + s3) / 3;
      char grade = 'F';
        
      if (avrage >= 90){
        grade = 'A';
      }else if (avrage >= 80){
        grade = 'B';
      }else if (avrage >= 70){
        grade ='C';
      }else if (avrage >= 60){
        grade = 'D';
      }
          return grade;
          
          
    }
}