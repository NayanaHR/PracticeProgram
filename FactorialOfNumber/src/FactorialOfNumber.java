import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter N ");
		int n = scan.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial is "+fact );
		

	}

}
