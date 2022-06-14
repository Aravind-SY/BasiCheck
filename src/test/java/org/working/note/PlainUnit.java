package org.working.note;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PlainUnit {
	
	@BeforeClass
	public static void startIt() {
    System.out.println("Start the browser"); 
	}
	
	@Before
	public void enterIt() {
		System.out.println("Enter the URL");
	}
	
	@Test
	public void tc1() {
		System.out.println("Enter to the Page");
	}
	
	
	@Test
	public void tc2() {
		System.out.println("Checked what is in the page");
	}
	
	@After
	public void tryToClose() {
		System.out.println("Close the page");
	}
	
	@AfterClass
	public static void browserClose() {
		System.out.println("closing the Browser");
	}

}
