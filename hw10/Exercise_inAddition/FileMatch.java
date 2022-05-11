//doesnt need to compile with --add-modules java.xml.bind FileMatch.java
import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.io.BufferedWriter;
import javax.xml.bind.JAXB;
public class FileMatch{
  public static void main(String[] args){
    try(Scanner input = new Scanner(Paths.get("oldmast.txt"))) {
    int  Asize = 1;
		int  Tsize = 1;
		Account[] currentMast = new Account[Asize];
		TransactionRecord[] currentTran = new TransactionRecord[Tsize];

    while (input.hasNext()) {
        Account x = new Account(input.nextInt(),input.next(),input.next(),input.nextDouble());
        currentMast[Asize-1] = x;
        if(input.hasNext()){
        Account[] copy = new Account[Asize +1];
        for(int i = 0; i <Asize;i++){
        copy[i] = currentMast[i];
        }
        currentMast = null;
        currentMast = copy;
        copy = null;
        Asize++;
        }
        }
      try(Scanner input2 = new Scanner(Paths.get("trans.txt"))) {
        while (input2.hasNext())  {
          TransactionRecord x = new TransactionRecord(input2.nextInt(),input2.nextDouble());
          currentTran[Tsize-1] =x;
          if(input2.hasNext()){
         TransactionRecord[] copy2 = new TransactionRecord[Tsize+1];
         for(int i = 0; i <Tsize;i++){
         copy2[i] = currentTran[i];
        }
       currentTran = null;
        currentTran = copy2;
        copy2 = null;
        Tsize++;
        }
      }      
        try (BufferedWriter output = Files.newBufferedWriter(Paths.get("newmast.xml"))){
          Accounts accounts = new Accounts();
          for(int i = 0; i < Asize;i++){
            boolean checker = false;
            for(int j = 0; j <Tsize;j++){
              if(currentMast[i].getAccountNumber() == currentTran[j].getAccountNumber()){
                try{
                    currentMast[i].setBalance(currentMast[i].combine(currentTran[j]));
                    accounts.getAccounts().add(currentMast[i]);
                    
         checker = true;}
              catch (NoSuchElementException elementException) {
               System.err.println("Invalid input.");
               System.exit(1); 
				} 
              }
              if(checker == false && j == Tsize-1){
                try{
                accounts.getAccounts().add(currentMast[i]);
              }
            catch (NoSuchElementException elementException) {
            System.err.println("Invalid input.");
            System.exit(1); 
          	} 
            }
            }
          }
		JAXB.marshal(accounts,output);
        }
        catch (IOException ioException) {
          System.err.println("Error opening file. Terminating.");
        }
        try(Formatter output = new Formatter("log.txt")){
          for(int j = 0; j < Tsize;j++){
            boolean checker = false;
            for(int i = 0; i <Asize;i++){
             if(currentMast[i].getAccountNumber() == currentTran[j].getAccountNumber())
             checker = true;
             else if(i == Asize-1 &&checker == false && currentMast[i].getAccountNumber() != currentTran[j].getAccountNumber()){
               try{
                output.format("Unmatched transaction record for account number...%d%n",currentTran[j].getAccountNumber());
              }
              catch (NoSuchElementException elementException) {
               System.err.println("Invalid input.");
               System.exit(1); 
                  }
                }
              }
            }
          }
        catch (SecurityException | FileNotFoundException |
        FormatterClosedException e) {
          e.printStackTrace();
          System.exit(1); 
        }
      }
      catch (IOException | NoSuchElementException |
      IllegalStateException e) {
        e.printStackTrace();
      }
    }
    catch (IOException | NoSuchElementException |
    IllegalStateException e) {
      e.printStackTrace();
    }
  }  
}
