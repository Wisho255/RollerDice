import java.util.Random;

public class rMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int generateRandomDieRoll(int a) {
		Random r = new Random();
		return r.nextInt(a);
	}

}
