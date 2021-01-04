package com.lennoxpros.qa.basePage;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basePage {

	public static WebDriver driver;
	public static Properties prop;

	public basePage() {
		try {
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "./config.properties");
			prop = new Properties();
			prop.load(ip);
		} catch (Throwable t) {

		}
	}

	public static void initialization() {
		String browsername = prop.getProperty("browser");
		if (browsername.equalsIgnoreCase("chrome"));
		System.setProperty(prop.getProperty("chromedriver"),System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));

	}

}
