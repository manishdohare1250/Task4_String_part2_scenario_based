package basic;

import java.util.Scanner;

public class _03_Customer_feedback {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("write your feedback:");
		String feedBack=sc.nextLine().toLowerCase();
		
		if(feedBack.contains("good") || feedBack.contains("excellent") || feedBack.contains("awesome") || feedBack.contains("great")   ) {
         System.out.println("Feedback is positive");
	}
		else {
			System.out.println("feedback is not positive.");
		}

}}
