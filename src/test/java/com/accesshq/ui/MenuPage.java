package com.accesshq.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuPage {
    private WebDriver driver;

    public MenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickDrinks() {
        for (WebElement currentButton : driver.findElements(By.className("v-tab"))) {
            if (currentButton.getText().contains("Drinks")) {
                currentButton.click();
            }
        }
    }

    public void giveRatings() {
        WebElement element = driver.findElement(By.className("rating-0"));
        element.findElement(By.cssSelector("[aria-label = Rating 2 of 5]")).click();
    }

    public boolean verifyRating() {
        return true;

    }
}
