import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter n:");
		int n =scan.nextInt();
		Series series=new Series();
		series.calculateFibonacci(n);
		}
}
