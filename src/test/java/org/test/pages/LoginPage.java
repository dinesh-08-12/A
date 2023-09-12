package org.test.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.test.base.BaseClass;

public class LoginPage extends BaseClass  {
	
	
	public  LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@CacheLookup
	@FindBys({@FindBy(id = "email")  , @FindBy(xpath="//input[@name='email']") })
	private List<WebElement> txtuser;

	@FindAll({@FindBy(id = "pass")  ,  @FindBy(xpath="//input[@name='pass']")})
	private WebElement txtpass;

	@FindBy(name = "login")
	private WebElement btnlogin;

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}

	public List<WebElement> getTxtuser() {
		return txtuser;
	}

	// private WebElement txtusername() {
	// WebElement txtuser = driver.findElement(By.id("email"));
	// return txtuser;
	//
	// }

}
