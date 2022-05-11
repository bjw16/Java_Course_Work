public class DateAndTime{
    
    private Time2 time;
    private Date newDate;
    
    public DateAndTime(int month, int day, int year, int hour, int minute, int second)
    {
       this.time = new Time2(hour, minute, second);
       this.newDate = new Date(month, day, year);
    }
    public void incrementHour(){
        this.time.incrementHour();
        if(this.time.getHour() == 0)
        {
            this.newDate.nextDay();
        }
    }
    public String toString(){
      return String.format("Date: %s Time: %s", this.newDate.toString(), this.time.toString());
    }
    public String toUniversalString(){
        return String.format("Date: %s Time: %s", this.newDate.toString(), this.time.toUniversalString());
    }
}
