package facebot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LikePost {

	public static void main(String[] args) throws Exception {
		
		WebDriver webdriver = WebDriverUtils.getWebDriver(
				"D:\\Desktop 5\\hacks\\facebot\\chromedriver.exe", 
				"D:\\Desktop 5\\hacks\\facebot\\profiles\\profile1"
			);
		
		String postUrl = "https://www.facebook.com/jurgen.claashaus/posts/2073832842683682";

		webdriver.get(postUrl);
		Thread.sleep(3000);
		WebElement elem = webdriver.findElement(By.xpath("//*[starts-with(@data-testid,'UFI2ReactionLink')]"));
		elem.click();
		Thread.sleep(3000);
	
	}
}
