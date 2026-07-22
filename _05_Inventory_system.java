package basic;

import java.util.Scanner;

public class _05_Inventory_system {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter product name:");
		String productName=sc.nextLine().toUpperCase();
		System.out.println("enter product Brand name:");
		String productBrand=sc.nextLine().toUpperCase();
		System.out.println("enter ProductId:");
		String productId=sc.next();
		
		
		String productcode="";
		productcode=productName.substring(0, 3)+productBrand.substring(0, 2)+productId.substring(productId.length()-3,productId.length());
 System.out.println("Your Productcode is:"+productcode);
	}

}
