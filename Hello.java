package opt1;
import java.util.Scanner;

public class Hello{
	public static void main(String[] args){
		System.out.println("Enter your name and press <Enter>:");
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		GreetingAction.printHello(name);
		scan.close();
	
	}
}

class GreetingAction{
	static void printHello(String name){
		System.out.println("Hello, "+ name +"!");
	}
}