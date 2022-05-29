package com.github.VolAndRnD.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class CheckoutOrderStepTwo extends BasePage {

    @FindBy(css = "[data-test='finish']" )
    private WebElement buttonFinish;
    @FindBy(css = "#logout_sidebar_link")
    private WebElement sidebarLogout;
    @FindBy(css = "#react-burger-menu-btn")
    private WebElement sidebar;

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
    public LoginPage returnButton() {
        sidebar.click();
        sidebarLogout.click();
        return new LoginPage(driver);

    }

}
