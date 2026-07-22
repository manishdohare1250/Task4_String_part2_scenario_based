package basic;

import java.util.Scanner;

public class _10_count_the_number_of_errors_and_print {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("write your log file content here:");
		String logfileContent=sc.nextLine();
		int errorcount=0;
		
		String[] split = logfileContent.split(" ");

		 for(int i=0;i<split.length-1;i++) {
			 if(split[i].equalsIgnoreCase("Error")) {
				 errorcount++;
			 }
		 }
		 System.out.println("Your Error count in currrent log file is:"+errorcount);
	}

}
