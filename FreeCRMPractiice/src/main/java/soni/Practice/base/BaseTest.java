package soni.Practice.base;

import soni.Practice.utilities.ExcelReaderWriter;

public class BaseTest {
	public static ConfigFileReader config;
	public static ExcelReaderWriter ReaderWriter;
	static {
		config = new ConfigFileReader();
		config.readconfigfile();
		ReaderWriter=new ExcelReaderWriter();
		config.getFileName();
		
		
		/*try {
			ReaderWriter.readExcelData(config.getFileName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			ReaderWriter.readExcelData(config.getUserName());
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			ReaderWriter.readExcelData(config.getPassword());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} */
	}

}
