public class OppositesAttract {

  public static boolean isLove(final int flower1, final int flower2) {
    
    boolean love = false;
    
    if(flower1 % 2 != 0 && flower2 % 2 == 0) {
      love = true;
    } else if(flower1 % 2 == 0 && flower2 % 2 != 0) {
      love = true;
    }
    
    return love;
    
    
    
  }
  
}