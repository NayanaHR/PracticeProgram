import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter a number");
		int n=scan.nextInt();
		System.out.println("Enter which number is multiple");
		
		int i=scan.nextInt();
		checkMultipleOfTen(n,i);
		
				}
	public static void checkMultipleOfTen(int n,int i)
	{
		if(n%i==0)
		{
			System.out.println("Entered number "+n+ " is multiple of "+i);
		}
		else
			System.out.println("Entered number "+n+ " is Not multiple of "+i);
		
		
	}
	

}
