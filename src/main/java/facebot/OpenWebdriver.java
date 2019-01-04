package facebot;

import org.openqa.selenium.WebDriver;

public class OpenWebdriver {

	public static void main(String[] args) throws Exception {
		
		WebDriver webdriver = WebDriverUtils.getWebDriver(
				"D:\\Desktop 5\\hacks\\facebot\\chromedriver.exe", 
				"D:\\Desktop 5\\hacks\\facebot\\profiles\\profile1"
			);
		
		webdriver.get("https://www.facebook.com/");

		//login on the browser with fb username/password
		//the access credentials are then stored in the profile dir and don't need to be entered again
		
	}
}
