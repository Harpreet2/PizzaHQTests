package com.accesshq.webtests;

import com.accesshq.ui.HomePage;
import com.accesshq.ui.MenuPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MenuTests extends BaseTestSuite {

    @Test
    public void itemsRatingsTest() {

        //Arrange
        HomePage homePage = new HomePage(driver);

        //Act
        homePage.clickMenu();
        MenuPage menuPage = new MenuPage(driver);
        menuPage.clickDrinks();
        menuPage.giveRatings();

        //Assert
        Assertions.assertEquals(true, menuPage.verifyRating());
    }
}
