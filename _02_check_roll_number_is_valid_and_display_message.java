package basic;

import java.util.Scanner;

public class _02_check_roll_number_is_valid_and_display_message{
 public static void main(String[] args) {
	 String rollNumberformat="CSE2026XXXX";
	 Scanner sc= new Scanner(System.in);
     System.out.println("Enter your RollNumber:");
     String rNumber =sc.nextLine();
     boolean isValid=true;
     
     if(rNumber.length()!=rollNumberformat.length()) {
    	 System.out.println("Length of your roll number is not appropriate,, use corrrect length,, it shgould be equal to: "+rollNumberformat.length());
    	 System.exit(0);
    	
     }
     else {
    	 if(rNumber.startsWith("CSE2026")) {
    		 for(int i=7;i<=10;i++) {
    			  if(Character.isDigit(rNumber.charAt(i))) {
    				  
    			  }
    			  else {
    				  isValid=false;
    				  return;
    			  }
    		 }
    	 }
     }
     
     if(isValid) {
    	 System.out.println("RollNumber is valid");
     }
     else {
    	 System.out.println("It is not valid");
     }
     
}
}
