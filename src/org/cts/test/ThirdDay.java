package org.cts.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ThirdDay {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\ThirdClass\\src\\driveR\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
String title = driver.getTitle();
System.out.println(title);
String url = driver.getCurrentUrl();
System.out.println(url);
WebElement user = driver.findElement(By.id("email"));
user.sendKeys("vijimom.satheesh@gmail.com");
WebElement password = driver.findElement(By.id("pass"));
password.sendKeys("harini1989");
WebElement button = driver.findElement(By.id("loginbutton"));
button.click();


}
}

