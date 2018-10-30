package asg_2;


import java.io.FileInputStream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import com.itextpdf.io.IOException;



public class readExcelFile{
	public static List<ResultList> findInfo() throws Exception{
		List<ResultList>  list= new ArrayList<ResultList>();
		
		final String file ="C:\\Users\\Asus\\Realtime_asg2\\chessResultsList.xls";
		try {
		HSSFWorkbook wb = new HSSFWorkbook(new FileInputStream(file));
		 Sheet sheet = wb.getSheetAt(0);
		 Iterator<Sheet> sIterator = wb.sheetIterator(); 
		 while (sIterator.hasNext()) {
			 sheet = sIterator.next();
			 
		 }
		 
		    Iterator<Row> rIterator = sheet.rowIterator();
		    String num="",name="",fieldID="",fed="",rtg="",cc="";
		    while(rIterator.hasNext()) {
		    	Row row = rIterator.next();
		    	
		    	Cell c1 = row.getCell(0);
		    	Cell c3 = row.getCell(2);
		    	Cell c4 = row.getCell(3);
		    	Cell c5= row.getCell(4);
		    	Cell c6 = row.getCell(5);
		    	Cell c7 = row.getCell(6);
		    	
		    	num = String.valueOf(c1);
		    	name = String.valueOf(c3);
		    	fieldID = String.valueOf(c4);
		    	fed = String.valueOf(c5);
		    	rtg = String.valueOf(c6);
		    	cc = String.valueOf(c7);
		    	
		    	list.add(new ResultList(num, name, fieldID, fed, rtg, cc));
		    }
		    
		    for(int a=1;a<list.size();a++) {
		    	list.get(0).getNum();
		    	list.get(2).getName();
		    	list.get(3).getFieldID();
		    	list.get(4).getFed();
		    	list.get(5).getRtg();
		    	list.get(6).getCc();
		    }
		
		wb.close();
		
		return list;
	}catch(IOException e) {
		e.printStackTrace();
	}
	return null;
}
}	
	
	
	
	
	
	
	
	
	
	