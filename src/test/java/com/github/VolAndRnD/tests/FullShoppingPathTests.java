package com.github.VolAndRnD.tests;

import com.github.VolAndRnD.pages.LoginPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

class FullShoppingPathTests extends BaseTest {

    @Test
    void authorisationPositivTest()  {
        //1.1.Авторизация
        new LoginPage(driver)
                .enterLogin(username)
                .enterPassword(password)
                .clickLoginButton()
                // 1.2. Выбор товара
                .checkInventoryPageUrl(inventoryUrl)
                .checkCartOnThePage()
                .choiceClothes1()
                .choiceClothes2()
                // 1.3. Переход в корзину
                .enterShoppingBascket()
                .checkCartPageUrl(cartUrl)
                //1.4. Оформление заказа
                .checkoutOrder()
                .checkCheckoutOrderStepOnePageUrl(checkoutOrderStepOnePageUrl)
                .inputFirstName("Andrew")
                .inputLastName("Volkov")
                .inputPostalCode("1234")

                // 2.1.*(необязательное задание) Боковое меню
                .findSidebar()
                .findSidebarInventory()
                .findSidebarAbout()
                .findSidebarLogout()
                .findSidebarReset()
                .findSidebarExit()
                //2.2 Header
                .findHeaderLogo()
                .findShoppingCartLink()
                .findTittle()
                //2.3 Центральные поля для ввода данных
                .findFirstName()
                .findLastName()
                .findPostalCode()
                .findButtonCancel()
                .findButtonContinue()
                //2.4. Подвал(чтобы это не означало, оно должно называться именно так)
                .findLinkTwitter()
                .findLinkFacebook()
                .findLinkLinkedin()
                .findFooterCopy()
                .findFooterRobot()
                //1.5. Завершение заказа
                .clickContinue()
                .checkCheckoutOrderStepTwoPageUrl(checkoutOrderStepTwoPageUrl)
                .clickButtonFinish();
    }



    @AfterAll
    static void afterAll(){
        driver.quit();
    }

}