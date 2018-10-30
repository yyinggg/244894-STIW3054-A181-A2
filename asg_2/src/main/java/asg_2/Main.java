package asg_2;

public class Main {
	
	public static void main (String[]args) throws Exception {
		
		System.out.println("Convert to pdf file successfully!");
		readExcelFile.findInfo();	
		convertPDF.main(args);
		
	}


}
