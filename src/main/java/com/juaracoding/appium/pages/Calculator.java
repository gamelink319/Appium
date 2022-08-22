package com.juaracoding.appium.pages;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Calculator {

	private AndroidDriver<MobileElement> driver;

	public Calculator(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
	}

	By btnSatu = By.id("com.android.bbkcalculator:id/digit1");
	By btnDua = By.id("com.android.bbkcalculator:id/digit2");
	By btnTambah = By.id("com.android.bbkcalculator:id/plus");
	By btnSamaDengan = By.id("com.android.bbkcalculator:id/equal");
	By Hasil = By.id("com.android.bbkcalculator:id/input_edit");

	// web: xpath = // taghtml[contains(@attr,vlue)]

	public void calcAdd() {
		driver.findElement(btnSatu).click();
		driver.findElement(btnTambah).click();
		driver.findElement(btnDua).click();
		driver.findElement(btnSamaDengan).click();
	}

	public String getTxtResult() {
		return driver.findElement(Hasil).getText();
	}
}