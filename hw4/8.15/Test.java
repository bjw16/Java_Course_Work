public class Test{
    public static void main(String[] args){
        Date newDate = new Date(1,1,2018);
        
       System.out.printf("%s%n", newDate.format1());
        Date new1Date = new Date("January",1,2018);
        System.out.printf("%s%n", new1Date.format2());
        Date new2Date = new Date(1,2018);
       System.out.printf("%s%n", new2Date.format3()); 
    }
}
