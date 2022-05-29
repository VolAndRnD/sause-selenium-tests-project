package com.github.VolAndRnD.tests;

import com.github.VolAndRnD.pages.LoginPage;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

public class CompareSorterTests extends BaseTest{
    @Story("goods sorting tests")
    @Feature("checking the operation of each sorter separately and comparing the availability of each product")
    @Test
    void CompareSorterTest() {
        new LoginPage(driver)
                .enterLogin(username)
                .enterPassword(password)
                .clickLoginButton1()
                .sorterAZ()
                .sorterZA()
                .sorterLOHI()
                .sorterHILO()
                .compareSorters();
    }

}
