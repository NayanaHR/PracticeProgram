import java.util.Scanner;

public class AmstrongApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter n");
		int n=scan.nextInt();
		Amstrong Am=new Amstrong();
		int Result=Am.checkAmstrongNumber(n);
		System.out.println(Result);
		if(n==Result)
		{
			System.out.println("The number "+n+" is Amstrong Number");
		}
		else
			System.out.println("The number "+n+" is Not  Amstrong Number");

	}

}
