public class HourlyEmployee extends Employee{
    private double hours;
    private double wage;
    
    public HourlyEmployee(String fname, String lname, String ssn, double wage, double hours){
       super(fname,lname,ssn);
       
       if(wage < 0)
        throw new IllegalArgumentException("Wage cant be a negative number!");
       else
        this.wage = wage;
       
       
       if(hours >=0 && hours <=168)
        this.hours = hours;
       else
        throw new IllegalArgumentException("Hours can only be set between 0 and 168!");
    }   
    
    public void setHours(double x){
         if(x >=0&& x <= 168){
            this.hours = x;
        }
        else
            throw new IllegalArgumentException("Hours can only be set between 0 and 168!");  
    }
    
    public void setWage(double y){
        if(y <0){
          throw new IllegalArgumentException("Wage cant be a negative number!");  
        }
        else
            this.wage = y;
    }
    
    @Override
    public String toString(){
        return String.format("%s%s: %.2f%n%s: %.2f%n%s: %.2f%n",super.toString(), "hours worked",
                    this.getHours(),"wage per hour", this.getWage(),"earnings", this.earnings());
    }
    public double getHours() {return hours;}
    public double getWage() {return wage;}
    public double earnings(){return this.getHours() * this.getWage();}
}
