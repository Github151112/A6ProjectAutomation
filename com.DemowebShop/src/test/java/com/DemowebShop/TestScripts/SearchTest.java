package com.DemowebShop.TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.DemowebShop.genericLib.Flib;
import com.DemowebShop.genericLib.IAutoConstant;

public class SearchTest implements IAutoConstant {

	@Test
	public void toWrite() throws EncryptedDocumentException, IOException {
		Flib l = new Flib();
		l.toWriteDataIntoExcelSheet(EXCELPATH, INVALID, 2, 2, "aman");
	}

}
