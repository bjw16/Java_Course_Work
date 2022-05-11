public class Employee extends Object{
  private final String firstName;
  private final String lastName;
  private final String socialSecurityNumber;

    public Employee(String fname, String lname, String sSN){
      this.firstName = fname;
      this.lastName = lname;
      this.socialSecurityNumber = sSN;
    }

    public String getFirstName(){
      return firstName;
    }

    public String getLastName(){
      return lastName;
    }

    public String getSocialSecurityNumber(){
      return socialSecurityNumber;
    }
    
    @Override
    public String toString(){
      return String.format("%s: %s %s%n%s: %s%n",
         "commission employee", firstName, lastName,
         "social security number", socialSecurityNumber);
    }
}
