public class Test{
    public static void main(String[] args){
        DateAndTime x = new DateAndTime(12,31,97,23,0,0);
        System.out.printf("Current Day: %s%n",x.toString());
        x.incrementHour();
        System.out.printf("Next Day: %s%n",x.toString());
    }
}
