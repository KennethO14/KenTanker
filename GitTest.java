
public class GitTest {
  
  
  public static void main(String[] args) { 
    
    if(args[0].equals ("add")){
      Double first = Double.parseDouble(args[1]);
            Double second = Double.parseDouble(args[2]);
            System.out.println(first + second);
    }
    
    if(args[0].equals ("subtract")){
      Double first = Double.parseDouble(args[1]);
            Double second = Double.parseDouble(args[2]);
            System.out.println(first - second);
    }
    
    if(args[0].equals ("multiply")){
      double first = double.parseDouble(args[1]);
            double second = double.parseDouble(args[2]);
            System.out.println(first * second);
    }
    
    
  }
  

  
}
