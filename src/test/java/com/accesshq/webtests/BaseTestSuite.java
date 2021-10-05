package com.accesshq.webtests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTestSuite {
    WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://d3udduv23dv8b4.cloudfront.net/#/");
    }

    @AfterEach
    public void cleanUp() {
        //driver.quit();
    }
}
