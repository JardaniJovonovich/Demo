package com.maven;

import java.util.Date;
import java.util.List;
import java.util.Set;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class bewaKoof {
	static WebDriver driver;
@BeforeClass
public static void charge() {
System.setProperty("webdriver.edge.driver", "C:\\Users\\Ashstarr\\eclipse-workspace\\May\\driver\\msedgedriver.exe");
driver = new EdgeDriver();
driver.manage().window().maximize();
driver.get("https://www.flipkart.com/search?q=Iphone&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
}
@AfterClass
public static void nightguy() {
	driver.quit();

}
@Before
public void hirudora() {
	Date D = new Date();
	System.out.println(D);

}
@After
public void asakujaku() {
	Date D1 = new Date();
	System.out.println(D1);

}
@Test
public void test() {
List<WebElement> tiger = driver.findElements(By.xpath("//a[contains(@class,'_2cLu-l')]"));
for (WebElement x : tiger) {
	if (x.getText().equals("Apple iPhone 7 Plus (Black, 32 GB)")) {
		x.click();
	}
	
}
String p = driver.getWindowHandle();
Set<String> c = driver.getWindowHandles();
for (String y : c) {
	if (!p.equals(y)) {
		driver.switchTo().window(y);
	}
}
driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")).click();
}



}
