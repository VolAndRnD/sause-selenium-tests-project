package com.github.VolAndRnD.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


public class CartPage extends BasePage {

    @FindBy(css = "[data-test='checkout']")
    private WebElement checkoutOrder;

    public CartPage(WebDriver driver) {
        super(driver);
    }
    public CartPage checkCartPageUrl(String CartUrl) {
        assertThat(driver.getCurrentUrl(), equalTo(CartUrl));
        return this;
    }

    public CheckoutOrderStepOne checkoutOrder(){
        checkoutOrder.click();
        return new CheckoutOrderStepOne(driver);
    }
}
