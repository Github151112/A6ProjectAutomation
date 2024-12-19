package com.DemowebShop.TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.DemowebShop.PomPages.LoginPage;
import com.DemowebShop.PomPages.WelcomePage;
import com.DemowebShop.genericLib.BaseTest;
import com.DemowebShop.genericLib.Flib;

public class ValidLoginTest extends BaseTest {
	
	@Test(groups = {"IT","ST","RT"})
	public void loginTestScript() throws EncryptedDocumentException, IOException {
		Flib f = new Flib();
		String email = f.getDataFromExcelSheet(EXCELPATH, LOGINSHEET, 1, 0);
		String password = f.getDataFromExcelSheet(EXCELPATH, LOGINSHEET, 1, 1);
		WelcomePage wp = new WelcomePage(driver);
		wp.getLoginLink().click();
		LoginPage lp = new LoginPage(driver);
		lp.loginInDemoWebShop(email,password);
	}

}
