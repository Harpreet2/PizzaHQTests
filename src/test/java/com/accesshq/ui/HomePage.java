package com.accesshq.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLoginorSignupButton() {
        WebElement button = driver.findElement(By.cssSelector("[aria-label='login or signup']"));
        button.click();
    }

    public void setUserName(String user) {
        WebElement userInput = driver.findElement(By.id("gen-20211005-username"));
        userInput.sendKeys(user);
    }

    public void setPassword(String password) {
        WebElement passwordInput = driver.findElement(By.id("gen-20211005-password"));
        passwordInput.sendKeys(password);
    }

    public void clickLogin() {
        WebElement button = driver.findElement(By.cssSelector("[aria-label='login']"));
        button.click();
    }

    public void clickProfile() {
        WebElement button = driver.findElement(By.cssSelector("[aria-label='your profile']"));
        button.click();
    }

    public void clickMenu() {
        WebElement button = driver.findElement(By.cssSelector("[aria-label='menu']"));
        button.click();
    }
}
