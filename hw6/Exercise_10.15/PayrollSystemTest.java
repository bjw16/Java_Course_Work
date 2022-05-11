// Fig. 10.9: PayrollSystemTest.java
// Employee hierarchy test program.

public class PayrollSystemTest {
   public static void main(String[] args) {
      
      // create subclass objects                                          
      SalariedEmployee salariedEmployee1 =                                 
         new SalariedEmployee("Brandon", "Whyte", "111-11-1111",800.00);    
      HourlyEmployee hourlyEmployee1 =                                     
         new HourlyEmployee("Ross", "Wade", "222-22-2222", 16.75, 40);  
      PieceWorker PieceWorker1 =                             
         new PieceWorker(                                          
         "Maddy", "Vanderslous", "333-33-3333",  100, 15);                      
      BasePlusCommissionEmployee basePlusCommissionEmployee1 =             
         new BasePlusCommissionEmployee(                                  
         "Daddy", "Long Legs", "444-44-4444",5000, .04, 300);
      PieceWorker PieceWorker2 =                                 
         new PieceWorker("Joan", "Rivers", "222-22-2222",900.00, 10);    
      HourlyEmployee hourlyEmployee2 =                                     
         new HourlyEmployee("Joel", "Osteen", "121-21-2121", 19.40, 45);  
      CommissionEmployee commissionEmployee2 =                             
         new CommissionEmployee(                                          
         "Tom", "Jones", "433-23-3131",10500, .06);                      
      BasePlusCommissionEmployee basePlusCommissionEmployee2 =             
         new BasePlusCommissionEmployee(                                  
         "Jerry", "Lewis", "435-12-1234", 6000, .04, 320);      

      // create four-element Employee array
      Employee[] employees = new Employee[8]; 

      // initialize array with Employees        
      employees[0] = salariedEmployee1;          
      employees[1] = hourlyEmployee1;            
      employees[2] = PieceWorker1;        
      employees[3] = basePlusCommissionEmployee1;
      employees[4] = PieceWorker2;          
      employees[5] = hourlyEmployee2;            
      employees[6] = commissionEmployee2;        
      employees[7] = basePlusCommissionEmployee2;

      System.out.printf("Employees processed polymorphically:%n%n");
      //System.out.printf("The current month is %02d/%02d/%d%n%n", currentDate.getMonth(),currentDate.getDay(),currentDate.getYear());

      // generically process each element in array employees
      for (Employee currentEmployee : employees) {
         System.out.println(currentEmployee); // invokes toString

         // determine whether element is a BasePlusCommissionEmployee
         if (currentEmployee instanceof BasePlusCommissionEmployee) {
            // downcast Employee reference to 
            // BasePlusCommissionEmployee reference
            BasePlusCommissionEmployee employee = 
               (BasePlusCommissionEmployee) currentEmployee;

            employee.setBaseSalary(1.10 * employee.getBaseSalary());

            System.out.printf(
               "new base salary with 10%% increase is: $%,.2f%n",
               employee.getBaseSalary());
         }
         
           System.out.printf("earned $%,.2f%n%n", currentEmployee.earnings());
      }


      // get type name of each object in employees array
      for (int j = 0; j < employees.length; j++) {      
         System.out.printf("Employee %d is a %s%n", j,  
            employees[j].getClass().getName());         
      }                                                 
   } 
} 


/**************************************************************************
 * (C) Copyright 1992-2018 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
