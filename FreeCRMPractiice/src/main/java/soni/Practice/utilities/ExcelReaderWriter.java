package soni.Practice.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.LinkedHashMap;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReaderWriter {
	
	LinkedHashMap<String,LinkedHashMap<Integer, LinkedHashMap<String, String>>> getfile;
	public void readExcelData(String filename) throws Exception{

		String rootFolder = System.getProperty("user.dir");
		String ExcelFilePath = rootFolder+"/TestData/"+filename;
		File file = new File(ExcelFilePath);
		FileInputStream excelFile = new FileInputStream(ExcelFilePath);
		XSSFWorkbook workbook = new XSSFWorkbook(excelFile);
		int noOFsheets = workbook.getNumberOfSheets();
		
	   getfile=new LinkedHashMap<String,LinkedHashMap<Integer, LinkedHashMap<String, String>>>();
		for(int i =0;i<noOFsheets;i++) {
			String sheetname = workbook.getSheetAt(i).getSheetName();
			System.out.println(sheetname);
			
		//	if(sheetname.equalsIgnoreCase("Login")) {
				XSSFSheet st = workbook.getSheetAt(i);
				int rowcount = st.getPhysicalNumberOfRows();
				System.out.println(rowcount);

				XSSFRow headerObj = st.getRow(0);
				LinkedHashMap<Integer,LinkedHashMap<String,String>>sheetMap = 
				new LinkedHashMap<Integer,LinkedHashMap<String,String>>();
				
				for(int j =1;j<rowcount;j++){
					XSSFRow rowobj= st.getRow(j);
					int cellCount = rowobj.getLastCellNum();
					System.out.println(cellCount);
					LinkedHashMap<String,String> rowMap = new LinkedHashMap<String,String>();
					
					for(int k =0;k<cellCount;k++){

						XSSFCell HeaderccellObj=headerObj.getCell(k);
						String HeaderColValue =HeaderccellObj.toString();
						//System.out.println(HeaderColValue);

						XSSFCell cellObj=rowobj.getCell(k);
						String ColValue =cellObj.toString();
						//System.out.println(ColValue);
						rowMap.put(HeaderColValue, ColValue);
					}
					System.out.println(rowMap);
					sheetMap.put(j, rowMap);
				}
			//	System.out.println(sheetMap);
				getfile.put(sheetname, sheetMap);
			}
			
		System.out.println(getfile);
	}
	
	public LinkedHashMap<Integer, LinkedHashMap<String, String>> getsheetData(String sheetname) {
		return getfile.get(sheetname);
	}
	public LinkedHashMap<String,String> getTestCaseData(String sheetname,int TC_ID)
	
	{
		return getfile.get(sheetname).get(TC_ID);
	}
	
	public String getColumnData(String sheetname,int TC_ID,String Column)
	{
		return getfile.get(sheetname).get(TC_ID).get(Column);
	}
}


