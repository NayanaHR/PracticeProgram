import java.util.Scanner;

import reveresingTheNumbers.Reverse;

public class PalindromeApp {

	public static void main(String[] args) {
		
			Scanner scan =new Scanner(System.in);
			System.out.println("Enter the N");
			int n=scan.nextInt();
			CheckPalindrome cp=new CheckPalindrome();
			int res=cp.reverseNum(n);
			System.out.println("The Reverse of the number "+n+" is "+res);
			if(n==res)
			{
				System.out.println("Entered number "+n+" is Palindrome");
			}
			else
				System.out.println("Entered number "+n+" is Not Palindrome");

	}

}
