package com.inbox.gmail;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GmailApplication {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
    //	options.setExperimentalOption("debuggerAddress", "localhost:9222");
	//options.addArguments("user-data-dir","C:\\Users\\user\\AppData\\Local\\Google\\Chrome\\User Data");
//	options.addArguments("");

	WebDriver driver = new ChromeDriver(options);
	//	driver = webdriver.Chrome(executable_path="C:\chromedriver.exe", options=o)
		
		
	//	options=driver.ChromeOptions();
	//	options.addArguments ();
		
	/*
	 * String pathToChrome = "driver/chromedriver.exe";
	 * System.setProperty("webdriver.chrome.driver", pathToChrome);
	 * 
	 * DesiredCapabilities capabilities = DesiredCapabilities(); String
	 * chromeProfile =
	 * "user-data-dir=C:\\Users\\user_name\\AppData\\Local\\Google\\Chrome\\User Data\\Default"
	 * ;
	 * 
	 * ArrayList<String> switches = new ArrayList<String>();
	 * switches.add("--user-data-dir=" + chromeProfile);
	 * capabilities.setCapability("chrome.switches", switches); WebDriver driver =
	 * new ChromeDriver(capabilities); driver.get("http://www.google.com");
	 */
		
		
		
	//	System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        //chrome://version/
        
        chromeOptions.addArguments("--user-data-dir=C:\\Users\\user\\AppData\\Local\\BraveSoftware\\Brave-Browser\\User Data");
        //load default profile
        chromeOptions.addArguments("--profile-directory=Default");
        chromeOptions.addArguments("excutiable-path=C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
		
		
		driver.get("www.github.com");
		
	}



}
