package com.accesshq.webtests;

import com.accesshq.ui.HomePage;
import com.accesshq.ui.ProfilePage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;


public class LoginTests extends BaseTestSuite {

    @Test
    public void LoginTest() throws InterruptedException {

        //Arrange
        HomePage homePage = new HomePage(driver);

        //Act
        homePage.clickLoginorSignupButton();
        homePage.setUserName("bob");
        homePage.setPassword("ilovepizza");
        homePage.clickLogin();
        homePage.clickProfile();
        ProfilePage profilePage = new ProfilePage(driver);

        //Assert
        Assertions.assertEquals(true, profilePage.getHeader().getText().contains("Welcome bob"));

        //Act
        String currentUrl = profilePage.getUrl();
        profilePage.hoverProfileButton();
        profilePage.clickLogoutButton();
        profilePage.clickYesButton(); //Doesn't work
        driver.get(currentUrl);

        //Assert
        Assertions.assertEquals("https://d3udduv23dv8b4.cloudfront.net/#/", currentUrl);

    }

}
