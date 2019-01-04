package facebot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WebDriverUtils {

	public static WebDriver getWebDriver(String webdriver, String profileDir){
        System.getProperties().setProperty("webdriver.chrome.driver", "D:\\Desktop 5\\hacks\\facebot\\chromedriver.exe");
        
        DesiredCapabilities dc = DesiredCapabilities.chrome();              
//        System.setProperty("http.proxyHost", "127.0.0.1");
//        System.setProperty("http.proxyPort", "60");
//        System.setProperty("https.proxyHost", "127.0.0.1");
//        System.setProperty("https.proxyPort", "60");                      
        ChromeOptions options = new ChromeOptions();
        options.addArguments("user-data-dir="+profileDir);
        
//        options.addArguments("--disable-gpu");
//        options.addArguments("--headless");
        
        dc.setCapability(ChromeOptions.CAPABILITY, options);
        
        WebDriver webDriver = new ChromeDriver(dc);

        return webDriver;
	}
}
