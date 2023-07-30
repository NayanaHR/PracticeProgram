import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the product code:");
		String Code= scan.next();
		getProduct(Code);
		
	}
	public static void getProduct(String productCode)
	{
		switch(productCode) {
		case "P01":System.out.println("Coca Cola");
					break;
		case "P02":System.out.println("Maaza");
					break;
		case "P03":System.out.println("Spirit");
					break;
		case "P04":System.out.println("Jeera");
					break;
		default:   System.out.println("Bindhu Water");
					break;
		}
	
	}
	
}
