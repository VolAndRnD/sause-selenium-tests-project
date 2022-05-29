package com.github.VolAndRnD.tests.tech;

import com.github.VolAndRnD.pages.InventoryPage;
import com.github.VolAndRnD.pages.LoginPage;
import com.github.VolAndRnD.tests.BaseTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.Cookie;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


@Slf4j
public class CookiesTests extends BaseTest {

    @Test
    void setCookiesTest(){
        InventoryPage inventoryPage = new LoginPage(driver)
                .enterLogin(username)
                .enterPassword(password)
                .clickLoginButton()
                .choiceClothes1()
                .choiceClothes2();
        assertThat(inventoryPage.getShoppingCartBadge().getText(),equalTo("2"));

        driver.manage().deleteAllCookies();
        driver.manage().addCookie(new Cookie("session-username","locked_out_user","/"));

        //driver.manage().getCookies().forEach(System.out::println);

    }
    @AfterAll
    static void quit(){
        driver.quit();
    }



}
