package com.github.VolAndRnD.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class CheckoutOrderStepTwo extends BasePage{

    @FindBy(css = "[data-test='finish']" )
    private WebElement buttonFinish;

    public CheckoutOrderStepTwo(WebDriver driver) {
        super(driver);
    }
    public CheckoutOrderStepTwo checkCheckoutOrderStepTwoPageUrl(String CheckoutOrderStepTwoPageUrl) {
        assertThat(driver.getCurrentUrl(), equalTo(CheckoutOrderStepTwoPageUrl));
        return this;
    }

    public CheckoutOrderStepTwo clickButtonFinish(){
        buttonFinish.click();
        return this;
    }

}
