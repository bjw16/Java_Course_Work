public class Date{
    private int day;
    private int month;
    private int year;
    //copied from 8.8
    private static final int[] daysPerMonth =
      {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    public Date(int month, int day, int year){
        if(month < 1 || month > 12)
        {
            throw new IllegalArgumentException(
            "month (" + month + ") must be 1-12");
        }
        else
        {
           if((year%100 != 0 && year%4 == 0) || (year%100 != 0 && year%400 == 0&&year%4 == 0))
           daysPerMonth[2] =29;
           
           if(day < 1 || daysPerMonth[month]<day)
           {
             throw new IllegalArgumentException("day (" + day +
            ") out-of-range for the specified month and year");
           }
           else
           {
            this.day = day;
            this.month = month;
            this.year = year;
           }
        }
    }
    
    public Date(String month, int day, int year){
        switch(month){
        case "January":
            this.month = 1;
            break;
        case "February":
            this.month = 2;
            break;
        case "March":
            this.month = 3;
            break;
        case "April":
            this.month = 4;
            break;
        case "May":
            this.month = 5;
            break;
        case "June":
            this.month = 6;
            break;
        case "July":
            this.month = 7;
            break;
        case "August":
            this.month = 8;
            break;
        case "September":
            this.month = 9;
            break;
        case "October":
            this.month = 10;
            break;
        case "November":
            this.month = 11;
            break;
        case "December":
            this.month = 12;
            break;
        default:
            throw new IllegalArgumentException(
            "month (" + month + ") must be 1-12");
         }
         
        if((year%100 != 0 && year%4 == 0) || (year%100 != 0 && year%400 == 0&&year%4 == 0))
           daysPerMonth[2] =29;
        
        if(day < 1 || daysPerMonth[this.month]<day)
        {
             throw new IllegalArgumentException("day (" + day +
            ") out-of-range for the specified month and year");
        }
        else
        {
          this.day = day;
          this.year = year;
        }
    }
    
    public Date(int DDD, int year){
        this.year = year;
        if(this.year%4 == 0){
            if(DDD<=31){this.month =1; this.day = DDD;}  
            else if(DDD > 31 && DDD <=60)  {this.month =2; this.day = DDD -31;}                          
            else if(DDD > 60 && DDD <= 91){this.month =3; this.day = DDD-60;}  
            else if(DDD > 91 && DDD <=121){this.month =4; this.day = DDD - 91;}                     
            else if(DDD >121 && DDD <=152) {this.month =5; this.day = DDD -121;}       
            else if(DDD >152 && DDD <=182) {this.month =6; this.day = DDD - 152;}  
            else if(DDD >182 && DDD <=213) {this.month =7; this.day = DDD -182;}      
            else if(DDD >213 && DDD <=244) {this.month =8; this.day = DDD - 213;}       
            else if(DDD >244 && DDD <=274) {this.month =9; this.day = DDD - 244;}          
            else if(DDD >274 && DDD <=305) {this.month =10; this.day = DDD - 274;}  
            else if(DDD >305 && DDD <=335) {this.month =11; this.day = DDD - 305;}  
            else if(DDD >335 && DDD <=366) {this.month =12;this.day = DDD - 335;}
            else{throw new IllegalArgumentException("day (" + day +
            ") out-of-range for the specified month and year");}
        }
        else{
            if(DDD<=31){this.month =1; this.day = DDD;}  
            else if(DDD > 31 && DDD <=59)  {this.month =2; this.day = DDD -31;}                          
            else if(DDD > 59 && DDD <= 90){this.month =3; this.day = DDD-59;}  
            else if(DDD > 90 && DDD <=120){this.month =4; this.day = DDD - 90;}                     
            else if(DDD >120 && DDD <=151) {this.month =5; this.day = DDD - 120;}       
            else if(DDD >151 && DDD <=181) {this.month =6; this.day = DDD- 151;}  
            else if(DDD >181 && DDD <=212) {this.month =7; this.day = DDD - 181;}      
            else if(DDD >212 && DDD <=243) {this.month =8; this.day = DDD - 212;}       
            else if(DDD >243 && DDD <=273) {this.month =9; this.day = DDD - 243;}          
            else if(DDD >273 && DDD <=304) {this.month =10; this.day = DDD - 273;}  
            else if(DDD >304 && DDD <=334) {this.month =11; this.day = DDD - 304;}  
            else if(DDD >334 && DDD <=365) {this.month =12; this.day = DDD - 334;}
            else{throw new IllegalArgumentException("day (" + day +
            ") out-of-range for the specified month and year");}
        }
     }
     
    public String format1(){
        return String.format("%02d/%02d/%d",this.day,this.month,this.year);
    }
    
    public String format2(){
        String month = null;
        switch(this.month){
        case 1:
            month = "January";
            break;
        case 2:
            month = "February";
            break;
        case 3:
            month = "March";
            break;
        case 4:
            month = "April";
            break;
        case 5:
            month = "May";
            break;
        case 6:
            month = "June";
            break;
        case 7:
            month = "July";
            break;
        case 8:
            month = "August";
            break;
        case 9:
            month = "September";
            break;
        case 10:
            month = "October";
            break;
        case 11:
            month = "November";
            break;
        case 12:
            month = "December";
            break;
        }
        return String.format("%s %d, %d",month, this.day, this.year); 
    }
    
    public String format3(){
        int DDD =0;
        if(this.month == 1)
        {
                DDD = this.day;
            
        }
        else if(this.month == 2)
        {
            if((this.year%4 == 0 && this.year%100 !=0) || (this.year%4 == 0 && this.year%100 ==0 && this.year%400 ==0))
            {
                DDD = this.day + 29;
            }
            else
            {
                DDD = this.day + 28;
            }
        }
        else if(this.month == 3)
        {
           if((this.year%4 == 0 && this.year%100 !=0) || (this.year%4 == 0 && this.year%100 ==0 && this.year%400 ==0))
            {
                DDD = this.day + 29 + 31;
            }
            else
            {
                DDD = this.day + 28 + 31;
            } 
        }
        else if(this.month == 4)
        {
          if((this.year%4 == 0 && this.year%100 !=0) || (this.year%4 == 0 && this.year%100 ==0 && this.year%400 ==0))
            {
                DDD = this.day + 29 + 31 + 30;
            }
            else
            {
                DDD = this.day + 28 + 31 + 30;
            }  
        }
        else if(this.month == 5)
        {
           if((this.year%4 == 0 && this.year%100 !=0) || (this.year%4 == 0 && this.year%100 ==0 && this.year%400 ==0))
            {
                DDD = this.day + 29 + 31 + 30 +31;
            }
            else
            {
                DDD = this.day + 28 + 31 + 30 +31;
            } 
        }
        else if(this.month == 6)
        {
           if((this.year%4 == 0 && this.year%100 !=0) || (this.year%4 == 0 && this.year%100 ==0 && this.year%400 ==0))
            {
                 DDD = this.day + 29 + 31 + 30 +31 + 30;
            }
            else
            {
                DDD = this.day + 28 + 31 + 30 +31 + 30;
            } 
        }
        else if(this.month == 7)
        {
           if((this.year%4 == 0 && this.year%100 !=0) || (this.year%4 == 0 && this.year%100 ==0 && this.year%400 ==0))
            {
                DDD = this.day + 29 + 31 + 30 +31 + 30+ 31;
            }
            else
            {
                DDD = this.day + 28 + 31 + 30 +31 + 30+ 31;
            } 
        }
        else if(this.month == 8)
        {
            if((this.year%4 == 0 && this.year%100 !=0) || (this.year%4 == 0 && this.year%100 ==0 && this.year%400 ==0))
            {
               DDD = this.day + 29 + 31 + 30 +31 + 30+ 31 + 31; 
            }
            else
            {
                DDD = this.day + 28 + 31 + 30 +31 + 30+ 31 + 31; 
            }
        }
        else if(this.month == 9)
        {
            if((this.year%4 == 0 && this.year%100 !=0) || (this.year%4 == 0 && this.year%100 ==0 && this.year%400 ==0))
            {
               DDD = this.day + 29 + 31 + 30 +31 + 30+ 31 + 31 + 30;  
            }
            else
            {
                DDD = this.day + 28 + 31 + 30 +31 + 30+ 31 + 31 + 30;  
            }
        }
        else if(this.month == 10)
        {
            if((this.year%4 == 0 && this.year%100 !=0) || (this.year%4 == 0 && this.year%100 ==0 && this.year%400 ==0))
            {
               DDD = this.day + 29 + 31 + 30 +31 + 30+ 31 + 31 + 30 + 31;   
            }
            else
            {
                DDD = this.day + 28 + 31 + 30 +31 + 30+ 31 + 31 + 30 + 31;  
            }
        }
        else if(this.month == 11)
        {
            if((this.year%4 == 0 && this.year%100 !=0) || (this.year%4 == 0 && this.year%100 ==0 && this.year%400 ==0))
            {
               DDD = this.day + 29 + 31 + 30 +31 + 30+ 31 + 31 + 30 + 31 + 30;    
            }
            else
            {
                DDD = this.day + 28 + 31 + 30 +31 + 30+ 31 + 31 + 30 + 31 + 30;    
            }
        }
        else if(this.month == 12)
        {
            if((this.year%4 == 0 && this.year%100 !=0) || (this.year%4 == 0 && this.year%100 ==0 && this.year%400 ==0))
            {
                DDD = this.day + 29 + 31 + 30 +31 + 30+ 31 + 31 + 30 + 31 + 30 + 31;    
            }
            else
            {
                DDD = this.day + 28 + 31 + 30 +31 + 30+ 31 + 31 + 30 + 31 + 30 + 31;    
            }
        }
        return String.format("%d %d",DDD,this.year); 
    }
}
