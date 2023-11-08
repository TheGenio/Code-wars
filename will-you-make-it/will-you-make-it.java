public class Kata {
  
  public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
    
    double milesCanDrive = distanceToPump / mpg;
    
    if (milesCanDrive <= fuelLeft){
      return true;
    } else{ return false;}
      
      
    
    
  }
  
}