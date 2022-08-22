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
	By btnEmpat = By.id("com.android.bbkcalculator:id/digit4");
	By btnLima = By.id("com.android.bbkcalculator:id/digit5");
	By btnEnam = By.id("com.android.bbkcalculator:id/digit6");
	By btnSembilan = By.id("com.android.bbkcalculator:id/digit9");
	By btnPerkalian = By.id("com.android.bbkcalculator:id/mul");
	By btnPembagian = By.id("com.android.bbkcalculator:id/div");
	By btnPengurangan = By.id("com.android.bbkcalculator:id/minus");
	By btnTambah = By.id("com.android.bbkcalculator:id/plus");
	By btnSamaDengan = By.id("com.android.bbkcalculator:id/equal");
	By Hasil = By.id("com.android.bbkcalculator:id/input_edit");
	By Clear = By.id("com.android.bbkcalculator:id/clear");

	// web: xpath = // taghtml[contains(@attr,vlue)]

	public void calcAdd() {
		driver.findElement(btnSatu).click();
		driver.findElement(btnTambah).click();
		driver.findElement(btnEnam).click();
		driver.findElement(btnSamaDengan).click();
	}

	public void calcDevided() {
		driver.findElement(btnEnam).click();
		driver.findElement(btnPembagian).click();
		driver.findElement(btnDua).click();
		driver.findElement(btnSamaDengan).click();
	}

	public void calcMultiple() {
		driver.findElement(btnSembilan).click();
		driver.findElement(btnPerkalian).click();
		driver.findElement(btnLima).click();
		driver.findElement(btnSamaDengan).click();
	}

	public void calcMinus() {
		driver.findElement(btnLima).click();
		driver.findElement(btnEmpat).click();
		driver.findElement(btnPengurangan).click();
		driver.findElement(btnDua).click();
		driver.findElement(btnSembilan).click();
		driver.findElement(btnSamaDengan).click();
	}

	public String getTxtResult() {
		return driver.findElement(Hasil).getText();
	}

	public void Clear() {
		driver.findElement(Clear).click();
	}
}