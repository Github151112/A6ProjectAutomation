package com.DemowebShop.TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.DemowebShop.PomPages.LoginPage;
import com.DemowebShop.PomPages.WelcomePage;
import com.DemowebShop.genericLib.BaseTest;
import com.DemowebShop.genericLib.Flib;

public class InvalidLoginTest extends BaseTest {

	@DataProvider(name = "InvalidData")
	public Object[][] invalidData() throws EncryptedDocumentException, IOException {
		
		return Flib.readExcel(EXCELPATH, INVALID);
		
	}

	@Test(dataProvider = "InvalidData",groups = "FT")
	public void invalidLoginTest(String username, String password) throws EncryptedDocumentException, IOException {
		WelcomePage wp = new WelcomePage(driver);
		wp.getLoginLink().click();
		LoginPage lp = new LoginPage(driver);
		lp.invalidloginInDemoWebShop(username, password);
		
		
	}

}
