package commonUtils;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class test4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		ExcelUtil util = new ExcelUtil();
		
		String a = util.getDataFromExcel("Sheet1", 2, 1);
		System.out.println(a);

		
	}

}
