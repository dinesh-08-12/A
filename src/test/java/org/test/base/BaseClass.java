package org.test.base;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	
	public static WebDriver driver;
	
	public static void chromeLaunch() {

		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		
	}
	
	private void edgeLaunch() {
		WebDriverManager.edgedriver().setup();
		 driver = new EdgeDriver();

	}
	
	public static void broswerLaunch(String broswername) {
		
		switch(broswername) {
		
		case "edge":
			WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
			 break;
			 
		case "chrome":
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			 break;
			
		}

	}
	
	
	
	//URL LAUCH
	public static void urlLaunch(String url) {
		driver.get(url);

	}
	
	//DYNAMIC WAIT
	public static void impWait(int sec) {

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
	}
	
	//SENKEYS
	public static void sendKeys(WebElement e,String data) {
		e.sendKeys(data);

	}
	
	
//	CLICK
	public static void click(WebElement e) {
		e.click();

	}
	
	//QUIT
	public static void quit() {
		driver.quit();
	}
	
	//GET CURRENT URL
	public static String getCurrentUrl() {
		String url = driver.getCurrentUrl();
		return url;

	}
	
	//GET TITLE
	public static String getTitle() {
		String t = driver.getTitle();
		return t;

	}
	
	public static String  getAttribute(WebElement e) {
		String ls = e.getAttribute("value");
		return ls;

	}
	
	public static void staticWait(int sec) throws InterruptedException {
		Thread.sleep(sec);

	}
	
	
	
	//Drag and drop
	public static void dragAndDrop(WebElement from,WebElement to) {
		Actions a=new Actions(driver);
		a.dragAndDrop(from, to).perform();
	}
	
	
	//ACTCLICK
	private void actClick(WebElement target) {
		Actions a=new Actions(driver);
		a.click(target).perform();

	}
	
	//SIMPLE
	public static void simpleAlert() {
		Alert a = driver.switchTo().alert();
		a.accept();

	}
	
	
//	Select
	public static void selectByIndex(WebElement e,int index) {
		Select s=new Select(e);
		s.selectByIndex(index);
		

	}
	
	
	
	//SCRENSHOOT,JS,WINDOWHANDLE,NAVIGATION
	
	
	public static void jsSendKeys(WebElement e,String data) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','"+data+"')", e);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
