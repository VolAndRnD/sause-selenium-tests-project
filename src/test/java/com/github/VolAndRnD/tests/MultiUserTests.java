package com.github.VolAndRnD.tests;

import com.github.VolAndRnD.pages.CheckoutOrderStepTwo;
import com.github.VolAndRnD.pages.LoginPage;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;




 public class  MultiUserTests extends BaseTest {
      @Story("the first problematic login is used")
      @Feature("when using this login, authorization is blocked")
      @Test
      void authorisationPositivTest1() {
         //1.1.Авторизация
         new LoginPage(driver)
                 .enterLogin(troubleUsername1)
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
                 //1.5. Завершение заказа
                 .clickContinue()
                 .checkCheckoutOrderStepTwoPageUrl(checkoutOrderStepTwoPageUrl)
                 .clickButtonFinish();

        }

     @Story("the second problematic login is used")
     @Feature("when using this login, the order confirmation is blocked")

     @Test
     void authorisationPositivTest2() {
         //1.1.Авторизация
         new LoginPage(driver)
                 .enterLogin(troubleUsername2)
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
                 //1.5. Завершение заказа
                 .clickContinue()
                 .checkCheckoutOrderStepTwoPageUrl(checkoutOrderStepTwoPageUrl)
                 .clickButtonFinish();

        }

     @Story("the third  problematic login is used")
     @Feature("when using this login, there is a time delay during authorization\n")

     @Test
     void authorisationPositivTest3() {
         //1.1.Авторизация
         new LoginPage(driver)
                 .enterLogin(troubleUsername3)
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
                 //1.5. Завершение заказа
                 .clickContinue()
                 .checkCheckoutOrderStepTwoPageUrl(checkoutOrderStepTwoPageUrl)
                 .clickButtonFinish();
     }

 }

