package com.accesshq.ui;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class ProfilePage {
    private WebDriver driver;

    public ProfilePage(WebDriver driver) {
        this.driver = driver;
    }


    public WebElement getHeader() {
        return driver.findElement(By.tagName("h2"));
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }

    public void hoverProfileButton() {
        WebElement button = driver.findElement(By.cssSelector("[aria-label='your profile']"));
        Actions action = new Actions(driver);
        action.moveToElement(button).perform();

    }

    public void clickLogoutButton() {
        for (WebElement currentButton : driver.findElements(By.tagName("div"))) {
            if (currentButton.getText().equals("Logout")) {
                currentButton.click();
            }
        }
    }

    public void clickYesButton() {
        WebElement button = driver.findElement(By.cssSelector("[aria-label=yes]"));
        button.click();

    }
}

