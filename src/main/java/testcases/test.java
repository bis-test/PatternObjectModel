package testcases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) {
		//Launch browser
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				
				//open the website
				driver.get("http://leaftaps.com/opentaps");
				driver.manage().window().maximize();
				
				//Enter user id
				driver.findElementById("username").sendKeys("DemoSalesManager");
				
				//Enter the password
				driver.findElementById("password").sendKeys("crmsfa");
				
				//Click the login button
				driver.findElementByClassName("decorativeSubmit").click();
				
				WebElement text = driver.findElementByXPath("//h2[contains(text(),'Welcome')]");
				System.out.println(text.getText());
				if(text.getText().contains("Welcome"))
					{
					System.out.println("Success");
					}
	}

}
