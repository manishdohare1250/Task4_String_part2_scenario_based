package basic;

import java.util.Scanner;

public class _07_Recruitment_portal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter resume content:");
		String resumeContent=sc.nextLine().toLowerCase();
		int skillCount=0;
		
		
	
		
		   if (resumeContent.contains("java")) {
	            skillCount++;
	        }

	        if (resumeContent.contains("spring boot")) {
	            skillCount++;
	        }

	        if (resumeContent.contains("sql")) {
	            skillCount++;
	        }

	        if (resumeContent.contains("react")) {
	            skillCount++;
	        }

System.out.println("Matching skill count is:"+skillCount);
	
	
	}

}
