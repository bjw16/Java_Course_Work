public class Test{

  public static void main(String[] args){
    Date newDate = new Date(1,1,2003);
    for(int i = 2; i <= 365;i++)
    {
      newDate.nextDay();
     
      if(i == 32){
      System.out.printf("Increment Month Test: %s%n", newDate.toString());
      newDate.nextDay();
      }
      else if(i == 365){
      System.out.printf("Increment Year Test: %s%n", newDate.toString());
      }
    }
  }
}
