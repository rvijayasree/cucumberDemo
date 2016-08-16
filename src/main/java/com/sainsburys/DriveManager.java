package com.sainsburys;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by Vijaya on 18/2016.
 */
public class DriveManager {

    public static WebDriver driver;
    private static final String URL = "https://www.sainsburys.co.uk/";
    public String browser = "";

    public DriveManager() {
        PageFactory.initElements(driver, this);
    }

    public void openBrowser() {
        switch (browser) {
            case "chrome":
                ChromeDriverManager.getInstance().setup();
                driver=new ChromeDriver();
                break;
            case "safari":
                driver = new SafariDriver();
                break;
            case "ie":
                InternetExplorerDriverManager.getInstance().setup();
                break;
            default:
                driver = new FirefoxDriver();
                break;
        }
        driver.get(URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void closeBrowser() {
        driver.quit();
    }


}
