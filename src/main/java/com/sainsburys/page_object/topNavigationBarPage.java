package com.sainsburys.page_object;

import com.sainsburys.DriveManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by rakesh on 8/16/2016.
 */
public class topNavigationBarPage extends DriveManager {

    @FindBy(css = "#utilityNavLoginLink>span")
    private WebElement loginLink;

    @FindBy(css = "#test>span")
    public WebElement groLink;

    @FindBy(linkText = "Bank account")
    public WebElement bankAccountLink;

    @FindBy(className = "loggedOutLink")
    public WebElement logOutLink;

    public void goToLoginPage() {
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


}
