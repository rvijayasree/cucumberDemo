package com.sainsburys.page_object;

import com.sainsburys.DriveManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Vijaya on 8/16/2016.
 */
public class topNavigationBarPage extends DriveManager {

    private static final By LOGIN_LINK = By.xpath(".//a[@id='utilityNavLoginLink']");

    @FindBy(xpath= ".//a[@id='utilityNavLoginLink']")
    private WebElement loginLink;

    @FindBy(css = "#test>span")
    private WebElement groLink;

    @FindBy(linkText = "Bank account")
    private WebElement bankAccountLink;

    @FindBy(css = ".loggedOutLink")
    private WebElement logOutLink;

    @FindBy(xpath = ".//*[@id='globalHeader']//a[contains(@href, '/MyAccount')]")
    private WebElement actualFullUserName;

    private WebDriver driver;


    public void goToLoginPage() {
        //driver.findElement(LOGIN_LINK).click();
        loginLink.click();
        groLink.click();
    }

    public void goToBankAccount() {
        loginLink.click();
        bankAccountLink.click();
    }

    public boolean isLogoutDisplayed() {
        return logOutLink.isDisplayed();
    }

    public boolean isUserNameDisplayed(String expectedFullUserName){
        System.out.println(actualFullUserName.getText());
        if((actualFullUserName.getText()).equalsIgnoreCase(expectedFullUserName)){
            return true;
        } else {
            return false;
        }
    }

 }
