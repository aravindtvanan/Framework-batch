package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	private void driver() {
		// TODO Auto-generated method stub

	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();


}
}
