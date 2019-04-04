package SeleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.chrome.driver","./browserdriver/chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.get("https://www.google.com");
      
	}

}
