
import java.util.Scanner;

public class RollerDice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		do {
			System.out.print("How many sides should each die have? ");
			int a = scan.nextInt();
			int result = 0;
			System.out.println("Roll 1:");
			for(int i = 0; i < 2;i++) {
				result = rMethod.generateRandomDieRoll(a);
				System.out.println(result);
			}
			System.out.println("Would you like to roll it again? y/n");
			scan.nextLine();
			String answ = scan.nextLine();
			if(answ.equalsIgnoreCase("n")) {
				run = false;
			}
			
		}while(run);
		scan.close();

	}

}
