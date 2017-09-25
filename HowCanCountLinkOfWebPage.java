package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HowCanCountLinkOfWebPage {
	WebDriver driver;
	
	@BeforeTest
	public void OpenBrowser(){
		driver=new FirefoxDriver();
		driver.get("https://www.google.com/?gws_rd=ssl");
		
	}
	@AfterTest
	public void CloseBrowser(){
		driver.close();
		
	}
	@Test
	public void LinkCounting(){
		List<WebElement>Links=driver.findElements(By.tagName("a"));
		
		int TotalLinks=Links.size();
		
		System.out.println("Total Links : "+TotalLinks);
		
		for(int i=1; i<Links.size(); i=i+1){
			System.out.println(i+". "+Links.get(i).getText());
		}
		
		
		
	}
	

}
