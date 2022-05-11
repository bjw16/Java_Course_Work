import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;
public class eliminateDuplicate{

	public static void main(String[] args){
		List<String> list = new ArrayList<String>();
		Scanner input = new Scanner(System.in);
		while(true){
			int response;
			String findName;
			String firstName;
			String listSpot;
		
			System.out.println("Press 1 to add name");
			System.out.println("Press 2 to search name");
			System.out.println("Press 0 to exit");
			response = input.nextInt();
			if(response == 1){
				System.out.printf("%nEnter first name: ");
				firstName = new String(input.next());
				list.add(firstName);
			}
			else if(response == 2){
				if(list.size()==0)
					System.out.printf("%nList is empty%n");
				else{
					System.out.printf("%nWhat name would you like to search for: ");
					findName = new String(input.next());	
					for(int i = 0; i < list.size();i++){
						listSpot = new String(list.get(i));
						if(findName.equals(listSpot)){
							System.out.printf("%n%s found!%n",listSpot);
							break;
						}
						else if(i == list.size()-1 && findName != listSpot)
						{
							System.out.printf("%nName not found!");
							System.out.println();
						}
						listSpot = null;
					}
				}
			}
			else{
				System.out.print("Goodbye!");
				break;
			}
			System.out.println();
			findName = null;
			firstName = null;
			listSpot = null;
		}
	}
}
