package asg_2;


import java.io.FileOutputStream;

import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Document;


public class convertPDF {
	
	private static String pdf= "C:\\\\Users\\\\Asus\\\\Realtime_asg2\\\\cheesResultsList.pdf";
	
	public static void main (String[] args)  {
		  try {
		        
		        Document dc = new Document();
	            PdfWriter.getInstance(dc, new FileOutputStream(pdf));
	            dc.open();
	     
	            
	       
	            PdfPTable table = new PdfPTable(6);
	            table.setWidths(new float[] {2,6,2,2,2,3});
	            
	     
	            for(ResultList list:readExcelFile.findInfo()) {
	            	table.addCell(list.getNum());
	            	table.addCell(list.getName());
	            	table.addCell(list.getFieldID());
	            	table.addCell(list.getFed());
	            	table.addCell(list.getRtg());
	            	table.addCell(list.getCc());
	            	
	            	
	            }
	            
	            dc.add(table);
	            
	            dc.close();
	         
	            
	            //Finally add the table to PDF document
	          
	}
	            
		  
		  catch (Exception e){
			  e.printStackTrace();
		  
		 }
	}




	          
}
