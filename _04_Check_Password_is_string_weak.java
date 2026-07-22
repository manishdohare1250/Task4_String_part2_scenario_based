package basic;

import java.util.Scanner;

public class _04_Check_Password_is_string_weak {

	public static void main(String[] args) {
	
		 Scanner sc= new Scanner(System.in);
	     System.out.println("create your Password:");
	     String password =sc.nextLine();
	     boolean isValid=false;	
	     
	if(password.length() <8){
		System.out.println("Password length is not valid, enter at least 8 character");
		System.exit(0);
	}
	else {
		int upperCase=0;
		int lowerCase=0;
		int digit=0;
		int speicialchar=0;
		for(int i=0;i<password.length()-1;i++) {
			if(Character.isUpperCase(password.charAt(i))) {
				upperCase++;
			}
			else if(Character.isLowerCase(password.charAt(i))) {
				lowerCase++;
			}
			else if(Character.isDigit(password.charAt(i))) {
				digit++;
			}
			else {
				speicialchar++;
			}
		}
		
		if(upperCase>0 && lowerCase>0 && digit>0 && speicialchar>0) {
			isValid=true;
		}
		else {
			isValid=false;
		}
	}
	
	
	
	if(isValid) {
		System.out.println("Your password is Strong");
	}else {
		System.out.println("Your password is weaK");
	}
	}

}
