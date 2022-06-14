package org.working.note.testNG;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.working.note.utilites.BaseClass;

public class OrderTestNg extends BaseClass {
	
	@BeforeClass
	private void launch() {

		launchChrome();
		maxi();
	}
	@BeforeMethod
	private void timeCheck() {
		dateTime();

	}
	

	@Test
	private void fpage() throws InterruptedException {
		driver.navigate().to("https://www.crazysales.com.au/");
		PojoCrazy p = new PojoCrazy();
		movement(p.getSignin());
		Thread.sleep(2000);
		btnClick(p.getSignin());

		
	}
	
//	@Ignore
//	@Test
//	private void spage() throws IOException {
//		PojoCrazy p = new PojoCrazy();
//		fill(p.getTxtUser(), dataSheet(1, 0));
//		fill(p.getTxtPass(), dataSheet(1, 1));
//		btnClick(p.getLogin());
//
//	}
	@AfterMethod
	private void timeout() {
		dateTime();
	}
	
	

}
