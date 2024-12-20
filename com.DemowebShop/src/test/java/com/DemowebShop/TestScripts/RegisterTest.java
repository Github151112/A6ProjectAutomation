package com.DemowebShop.TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.DemowebShop.PomPages.RegisterPage;
import com.DemowebShop.PomPages.WelcomePage;
import com.DemowebShop.genericLib.BaseTest;
import com.DemowebShop.genericLib.CustomListener;
import com.DemowebShop.genericLib.Flib;
import com.DemowebShop.genericLib.WorkLib;


@Listeners(CustomListener.class)
public class RegisterTest extends BaseTest {

	String email = "pragati" + WorkLib.getRandomNo(1000) + "@gmail.com";

	@Test(groups = { "ST", "RT" })
	public void registerTestScript() throws EncryptedDocumentException, IOException {
		Flib lib = new Flib();
		String firstName = lib.getDataFromExcelSheet(EXCELPATH, REGSHEET, 1, 0);
		String lastName = lib.getDataFromExcelSheet(EXCELPATH, REGSHEET, 1, 1);
		String password = lib.getDataFromExcelSheet(EXCELPATH, REGSHEET, 1, 3);
		// click on register link
		WelcomePage wp = new WelcomePage(driver);
		wp.getRegisterLink().click();
		// perform registration process
		RegisterPage rp = new RegisterPage(driver);
		rp.toRegisterIntoDemoWeb(firstName, lastName, email, password);
		System.out.println(email);

	}

}
