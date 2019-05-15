package opt1;
import java.util.Random;
import java.util.Scanner;

public class RandomNumbers{
	private final int N;

	public RandomNumbers(final int M){
		N = M;
	}
	public static void main(String[] args){
		System.out.println("Enter your name and press <Enter>:");
		Scanner scan = new Scanner(System.in);
		RandomNumbers randNum = new RandomNumbers(scan.nextInt());
		scan.close();

		randNum.printRandomNumbers();
		randNum.printlnRandomNumbers();
	}
	public void printRandomNumbers(){
		System.out.println("printRandomNumbers:");
		Random rnd = new Random();
		for (int i = 0; i < N; i++){
			System.out.print(rnd.nextInt() + " ");
		}
		System.out.println();
		
	}
	public void printlnRandomNumbers(){
		System.out.println("printlnRandomNumbers:");
		Random rnd = new Random();
		for (int i = 0; i < N; i++){
			System.out.println(rnd.nextInt() + " ");
		}
	}
}