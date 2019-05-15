package opt1;

public class SumArguments{
	public static void main(String[] args){
		int sum = 0;
		int product = 1;
		int tmp;
		for (String str: args){
			tmp = Integer.valueOf(str);
			sum += tmp;
			product = product * tmp;
		}
		System.out.println("Sum: " + sum + "\nProduct: " + product);
	}
}