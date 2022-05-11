public class Test{

    public static void main(String[] args)
    {

      Time2 time = new Time2(10,34,12);
      System.out.printf("The current time is %s%n",time.toString());
      time.tick();
      System.out.printf("Tick Method: %s%n",time.toString());
      time.incrementMinute();
      System.out.printf("incrementMinute Method: %s%n",time.toString());
      time.incrementHour();
      System.out.printf("incrementHour Method: %s%n%n",time.toString());

      Time2 nextDay = new Time2(23,59,59);
      System.out.printf("Increment to next day using tick(): %n-Current Time: %s%n",nextDay.toString());
      nextDay.tick();
      System.out.printf("-tick method: %s%n",nextDay.toString());

      Time2 anotherDay = new Time2(23,59,59);
      System.out.printf("Increment to next day using incrementMinute: %n-Current Time: %s%n",anotherDay.toString());
      anotherDay.incrementMinute();
      System.out.printf("-incrementMinute method: %s%n",anotherDay.toString());

      Time2 moreDay = new Time2(23,59,59);
      System.out.printf("Increment to next day using incrementHour: %n-Current Time: %s%n",moreDay.toString());
      moreDay.incrementHour();
      System.out.printf("-incrementHour method: %s%n",moreDay.toString());


    }
}
