package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testngbegginer {
 @Test(description="launch")
 public void  loginapplication()
 {
	 WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumhq.org/");
 }
}
                        