package opt1;

public class PrintReverseArguments{
	public static void main(String[] args) {
		for (int i = args.length-1; i>=0; i--)
			System.out.println("Argument-> "+args[i]);
	}
}