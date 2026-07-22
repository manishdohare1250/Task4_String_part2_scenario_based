package basic;

import java.util.Scanner;

public class _11_check_invoice_number_is_in_standard_format_or_not {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your invoice number:");
		String invoiceNumber=sc.nextLine().trim().toUpperCase().replace(' ', '-');
	   System.out.println("Your Standard format  invoice number  is: "+invoiceNumber);	
	}

}
