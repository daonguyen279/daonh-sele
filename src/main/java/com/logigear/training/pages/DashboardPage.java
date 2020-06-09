package com.logigear.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import com.logigear.training.utilities.ElementHelper;

public class DashboardPage {
	ElementHelper lnkMyAccount = new ElementHelper(By.cssSelector("ul.head-menu > li:nth-of-type(5) [href='#']"));

	ElementHelper lnkLogout = new ElementHelper(By.cssSelector("a[href='logout.do']"));

	ElementHelper txtLoginSuccessMessage = new ElementHelper(By.cssSelector("a[href='#Welcome']"));

	public void clickMyAccount() {
		txtLoginSuccessMessage.click();
		lnkMyAccount.click();
	}

	public String getLoginSuccessText() {
		return txtLoginSuccessMessage.getText();
	}

	public void logout() {
		try {
			txtLoginSuccessMessage.click();
			lnkLogout.click();
		} catch (NoSuchElementException ex) {

		}
	}
}