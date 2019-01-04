package facebot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddRandomFriends {

	public static void main(String[] args) throws Exception {
		
		WebDriver webdriver = WebDriverUtils.getWebDriver(
				"D:\\Desktop 5\\hacks\\facebot\\chromedriver.exe", 
				"D:\\Desktop 5\\hacks\\facebot\\profiles\\profile1"
			);
		
		int numFriendsToAdd = 10;
		
		
		for (int i = 0; i < numFriendsToAdd; i++) {
			webdriver.get("https://www.facebook.com/find-friends/browser/");
			Thread.sleep(3000);
			WebElement elem = webdriver.findElement(By.xpath("//*[starts-with(@class,'FriendButton')]"));
			elem.click();
			Thread.sleep(3000);
		}
		
	}
}
