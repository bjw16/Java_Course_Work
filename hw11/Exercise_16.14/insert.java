import java.util.LinkedList;
import java.util.Arrays;
import java.security.SecureRandom;
public class insert{
	private static final SecureRandom randomNumbers = new SecureRandom();
	public static void main(String[] args){
		LinkedList<String> links = new LinkedList();
		int total = 0;
		float average;
		for(int i = 0; i < 25; i++){
			int x = 1 + randomNumbers.nextInt(100);
			total = total + x;
			String y = String.format("%d",x);
			if(i ==0)
				links.addFirst(y);
			else if(i == 24)
				links.addLast(y);
			else
				links.add(y);
		}
			
		average = total/25;
		System.out.printf("Sorted list : ");
		for(int i = 0; i < 25; i++)
			System.out.printf("%s ",links.get(i));
				
		System.out.printf("%naverage: %f%n",average);
	}
}
