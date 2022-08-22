package com.juaracoding.appium;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.juaracoding.appium.pages.Calculator;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class TestCalculator {

	private AndroidDriver<MobileElement> driver;
	private Calculator calculator;

	@BeforeClass
	public void SetUP() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "vivo vivo 1919");
		capabilities.setCapability("uuid", "emulator-5554");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("AppPackage", "com.android.bkkcalculator.Calculator");
		capabilities.setCapability("AppActivity", "com.android.bbkcalculator.CalculatorSettingActivity");

		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	}

	@BeforeMethod
	public void pageObject() {
		calculator = new Calculator(driver);
	}

	@Test
	public void testAdd() {
		calculator.calcAdd();
		System.out.println("Hasil = " + calculator.getTxtResult());
		assertEquals(calculator.getTxtResult(), "3");
	}

	@AfterClass
	public void CloseApp() {
		driver.quit();
	}
}
