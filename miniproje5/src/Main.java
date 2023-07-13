
public class Main {
    public static void main(String[] args) {
      int [] numbers=new int[] {6 , 5 , 75 , 1 , 7 , 8 };
      int find=6;
      boolean have=false;
      for(int number : numbers){
          if(number==find){
              have=true;
              break;
          }
      }
      if(have){
          System.out.println("The number is here.");
      }
      else{
          System.out.println("The number is not here.");
      }
    }
}