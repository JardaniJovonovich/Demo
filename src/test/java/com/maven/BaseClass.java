package com.maven;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {
	public static WebDriver driver;
public static void launchBrowser(String url) {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\Ashstarr\\eclipse-workspace\\May\\driver\\msedgedriver.exe");
	driver = new EdgeDriver();
	driver.get(url);
	
}
    public static void clickstuff(WebElement ele) {
    	Actions a = new Actions(driver);
    	a.click(ele).perform();
    }
    public static void entertext(WebElement ele,String value) {
    	Actions a = new Actions(driver);
    	a.sendKeys(ele, value).perform();
    }
    public static void roBot(WebElement ele) throws Exception {
    	Robot r = new Robot();
    	for (int i = 0; i < 2; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
    	r.keyPress(KeyEvent.VK_ENTER);
    	r.keyRelease(KeyEvent.VK_ENTER);
    }
    public static void cntrlA(WebElement ele) throws Exception {
    	Robot r = new Robot();
    	r.keyPress(KeyEvent.VK_CONTROL);
    	r.keyPress(KeyEvent.VK_A);
    	r.keyRelease(KeyEvent.VK_CONTROL);
    	r.keyRelease(KeyEvent.VK_A);
    }
    public static void rightclik(WebElement ele) {
    	Actions a = new Actions(driver);
    	a.contextClick(ele).perform();
    	
    }
    public static void roBott(WebElement ele) throws Exception {
    	Robot r = new Robot();
    	for (int i = 0; i < 4; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
    	r.keyPress(KeyEvent.VK_ENTER);
    	r.keyRelease(KeyEvent.VK_ENTER);
    }
    public static void signInn(WebElement ele) {
    	JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("arguments[0].click()", ele);
    }
    public static void tXt(WebElement ele) {
    	String text = ele.getText();
    	System.out.println(text);
    }
    public static void Title() {
    	String title = driver.getTitle();
    	System.out.println(title);
    }
    public static void uRl() {
    	String currentUrl = driver.getCurrentUrl();
    	System.out.println(currentUrl);
    }
    public static void mailorph(WebElement ele) {
    	JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("arguments[0].setAttribute('value','Madara Uchiha')", ele);
    }

}
