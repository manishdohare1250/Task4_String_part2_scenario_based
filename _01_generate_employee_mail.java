package basic;

import java.util.Scanner;

public class _01_generate_employee_mail {

	public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter your full name:");
       String employeeFullName=sc.nextLine();
       System.out.println("Enter your Department name:");
       String deptName=sc.nextLine();
       
       String generatedMail="";
       
       generatedMail=employeeFullName.trim().toLowerCase().replace(" " , ".")+"@abc.com";
       System.out.println("Your mail is:"+generatedMail);
	}

}
