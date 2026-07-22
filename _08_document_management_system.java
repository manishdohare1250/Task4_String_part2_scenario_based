package basic;

import java.util.Scanner;

public class _08_document_management_system {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	System.out.println("Enter fileName:");
	String fileName=sc.nextLine().toLowerCase();
	
	String fileType="";
	String extension=fileName.substring(fileName.indexOf('.')+1);
	
     if(extension.equalsIgnoreCase("pdf")){
    	 fileType="PDF";
     }
     else if(extension.equalsIgnoreCase("doc") || extension.equalsIgnoreCase("docx")) {
    	 fileType="word";
     }
     else if(extension.equalsIgnoreCase("exl")) {
    	 fileType="excel";
     }
     else if(extension.equalsIgnoreCase("png") || extension.equalsIgnoreCase("jpg")||extension.equalsIgnoreCase("jpeg")) {
    	 fileType="Image";
     }
    	
     System.out.println("File Type is :"+fileType);
     }


}
