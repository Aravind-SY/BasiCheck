package org.working.note.testNG;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.working.note.utilites.BaseClass;

public class PojoCrazy extends BaseClass{
	
	public PojoCrazy() {
		PageFactory.initElements(driver, this);
	}
	
	@FindAll({
		@FindBy(xpath="(//a[@rel='nofollow'])[7]"),
		@FindBy(xpath="//a[text()='Sign In']")
		})
	private WebElement signin;
	
	@FindBy(id="email")
	private WebElement txtUser;
	
	@FindBy(id="password")
	private WebElement txtPass;
	
	@FindBy(id="login-button")
	private WebElement login;

	public WebElement getSignin() {
		return signin;
	}

	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getLogin() {
		return login;
	}
	
	

}
