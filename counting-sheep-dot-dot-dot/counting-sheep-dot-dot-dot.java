public class Counter {
  public int countSheeps(Boolean[] arrayOfSheeps) {
    
    
    int counter =0;
    
    if (arrayOfSheeps.length > 0){
      
      
    
      for (int i = 0; i < arrayOfSheeps.length; i++){
        if (arrayOfSheeps[i] != null){ 
          
          if(arrayOfSheeps[i] == true){ counter ++;}
          }
      }
    
    } else{}
    
    return counter;
    
    }
  }