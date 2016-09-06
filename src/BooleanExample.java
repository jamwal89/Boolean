import java.util.Scanner;
public class BooleanExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner scan= new Scanner(System.in);
		int score = scan.nextInt();
		

		if (score > 89) {
			if (score%10 < 3)
				System.out.println("A+");
			else if (score%10 < 3 && score%10<7)
				System.out.println("grade = ('A-')");
			else 
				System.out.println("A");
		}
		
		    
		else if (score > 79)
			System.out.println("B");
		else if (score > 70)
			System.out.println("C");
		else if (60 > score && score > 69 )
			System.out.println("D");

		if (score > 69)
		    System.out.println("Very good! You don't have to retake the exam!");
		else
		    System.out.println("Did you even look at the book?");

	}

}
