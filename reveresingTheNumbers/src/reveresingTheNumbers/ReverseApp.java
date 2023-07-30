package reveresingTheNumbers;

import java.util.Scanner;

public class ReverseApp {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the N");
		int n=scan.nextInt();
		Reverse rv=new Reverse();
		int res=rv.reverseNum(n);
		System.out.println("The Reverse of the number "+n+" is "+res);

	}

}
