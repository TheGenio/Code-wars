public class Kata
 {
  public static int squareSum(int[] n)
  { 
     int sum = 0;
     for (int i = 0; i < n.length; i++) {
       sum = sum + (int)Math.pow(n[i], 2);
     }
     return sum;
  }
 }