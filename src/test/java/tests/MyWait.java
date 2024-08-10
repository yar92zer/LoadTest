package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MyWait {
    private WebDriver driver;
    private WebDriverWait wait;

    public MyWait(WebDriver driver, int secondsToWait) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(secondsToWait));
    }

    public static MyWait myWait(WebDriver driver, int seconds) {
        return new MyWait(driver, seconds);
    }

    public WebElement visible(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public WebElement clickable(By locator) {
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
}