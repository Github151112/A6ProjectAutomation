package com.DemowebShop.TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.DemowebShop.PomPages.LoginPage;
import com.DemowebShop.PomPages.WelcomePage;
import com.DemowebShop.genericLib.BaseTest;
import com.DemowebShop.genericLib.CustomListener;
import com.DemowebShop.genericLib.Flib;

@Listeners(CustomListener.class)
public class ValidLoginTest extends BaseTest {

	@Test(groups = { "IT", "ST", "RT" })
	public void loginTestScript() throws EncryptedDocumentException, IOException {
		Flib f = new Flib();
		String email = f.getDataFromExcelSheet(EXCELPATH, LOGINSHEET, 1, 0);
		String password = f.getDataFromExcelSheet(EXCELPATH, LOGINSHEET, 1, 1);
		WelcomePage wp = new WelcomePage(driver);
		wp.getLoginLink().click();
		 
		/**
		 * use hard Assert
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Login");
		 */
		
		SoftAssert s= new SoftAssert();
		s.assertEquals(driver.getTitle(), "Demo Web Shop. Logi");
		
		
		LoginPage lp = new LoginPage(driver);
		lp.loginInDemoWebShop(email, password);
		
		Assert.assertEquals(wp.getLogoutLink().isEnabled(), true);
		
		s.assertAll();

	}

}
