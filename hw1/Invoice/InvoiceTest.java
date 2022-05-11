/*--------------------- InvoiceTest.java -------------------------------
Brandon Whyte --- Section 1

Program used to test the invoice class. It will ask the user to give it
info and then returns it. First it test if default values are saved cor
rectly, then it test user input storage.
*/
import java.util.Scanner;

public class InvoiceTest{
  public static void main(String[] args)
  {
    //Set outside classes
    Scanner input = new Scanner(System.in);
    Invoice myInvoice = new Invoice();

    //intro
    System.out.printf("The following determines if Invoice class correctly:%n--------------------------------------------------------------%n");

    //Determine if default constructor sets things to null
    System.out.printf("The following test determines if the constructor sets un-%n", "initialized data to default values.%n");
    System.out.printf("The part number is: %s%n", myInvoice.getPartNumber());
    System.out.printf("The part description is: %s%n", myInvoice.getPartDescription());
    System.out.printf("The Quanity of items: %d%n", myInvoice.getQuanity());
    System.out.printf("The price per item is: $%.2f%n", myInvoice.getPricePerItem());
    System.out.printf("The invoice amount is: $%.2f%n", myInvoice.getInvoiceAmount());
    System.out.printf("--------------------------------------------------------------%n");

    //Following input's are used to allow the user to set item info.
    System.out.printf("Now we would like to test if the user input feature works: %n");
    System.out.print("Part number: ");
    myInvoice.setPartNumber(input.nextLine());

    System.out.print("Part description: ");
    myInvoice.setPartDescription(input.nextLine());

    System.out.print("Quanity of item: ");
    myInvoice.setQuanity(input.nextInt());

    System.out.print("Price per item: $");
    myInvoice.setPricePerItem(input.nextDouble());
    System.out.println("-------------------------------------------------------------");


    //Outputs used to return info, and make sure they were stored ok.
    System.out.printf("The part number is: %s%n", myInvoice.getPartNumber());
    System.out.printf("The part description is: %s%n", myInvoice.getPartDescription());
    System.out.printf("The Quanity of items: %d%n", myInvoice.getQuanity());
    System.out.printf("The price per item is: $%.2f%n", myInvoice.getPricePerItem());
    System.out.printf("The invoice amount is: $%.2f%n", myInvoice.getInvoiceAmount());
  }
}
