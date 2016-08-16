package com.sainsburys.page_object;

import com.sainsburys.DriveManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by rakesh on 8/16/2016.
 */
public class LoginPage extends DriveManager {

    @FindBy(id = "logonId")
    private WebElement userNameTxt;

    @FindBy(id="logonPassword")
    private WebElement passwordTxt;

    @FindBy(css = ".button.process")
    private WebElement submitBtn;

    public void doLogin(String userName, String password){
        userNameTxt.sendKeys(userName);
        passwordTxt.sendKeys(password);
    }

    public void clickOnLogin(){
        submitBtn.click();
    }
}
