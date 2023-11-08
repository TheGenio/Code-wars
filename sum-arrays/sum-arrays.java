public class SumArray {

  public static double sum(double[] numbers) {
    
    if (numbers.length > 0){
      double sum = 0.0;
      for (int i = 0; i<numbers.length; i++){
        sum = sum + numbers[i];
      }
      return sum;
      
    }else{
      
      return 0.0;
    }
    
  }
}