import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("ËNter N");
	int n=scan.nextInt();
	int sum=0;
	for(int i=0;i<=n;i++)
	{
		sum=sum+i;
	}
	System.out.println("Sum is "+sum);

}
}
