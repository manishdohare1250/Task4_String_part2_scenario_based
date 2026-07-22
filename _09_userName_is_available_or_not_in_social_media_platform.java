package basic;

import java.util.Scanner;

public class _09_userName_is_available_or_not_in_social_media_platform {

	public static void main(String[] args) {
		String [] users= {"Rohit","manish","Priyanshu","Parmanand"};
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your userName:");
		String userName=sc.next();
		boolean isUsernameAvailable=true;
		
		for(int i=0;i<users.length-1;i++) {
			if(userName.equals(users[i])){
				isUsernameAvailable=false;
			}
		}
		if(isUsernameAvailable) {
			System.out.println("Username  is  available, you can use this username");
		}
		else {
			System.out.println("usrname is not available, you have to choose diffrent one.");
		}

	}

}
