package basic;

import java.util.Scanner;

public class _12_enter_url_of_website_and_check_it_is_secure_or_valid_or_not_by_sseing_starting_url_ {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter website url:");
		String str=sc.next();
		
		if(str.startsWith("https://")) {
			System.out.println("It is valid and secure website");
		}
		else {
			System.out.println("It is not secure website....");
		}
	}

}
