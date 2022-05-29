package com.github.VolAndRnD.tests;

import com.github.VolAndRnD.pages.LoginPage;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.Test;

@Feature("Тесты на подвал страницы")
public class PageFooterTests extends BaseTest{

    @Test
    void goToLinkedInTest(){
        new LoginPage(driver)
                .enterLogin(username)
                .enterPassword(password)
                .clickLoginButton()
                .goToLinkedIn();
    }
}
