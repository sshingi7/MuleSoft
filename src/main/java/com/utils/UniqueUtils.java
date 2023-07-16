package com.utils;

import java.io.File;

import org.docx4j.openpackaging.packages.SpreadsheetMLPackage;

public class UniqueUtils {
	public static String getXMLFile(){
		try {
			File file = new File("C:\\Excel\\Input\\sample-excel-file.xlsx");
			SpreadsheetMLPackage excelMLPackage = SpreadsheetMLPackage.load(file);
			excelMLPackage.save(new File("C:\\Excel\\Output\\xmlFile.xml"));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Success";
	}
}
