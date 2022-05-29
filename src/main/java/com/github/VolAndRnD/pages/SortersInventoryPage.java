package com.github.VolAndRnD.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


public class SortersInventoryPage extends BasePage {

    @FindBy(css = "[value = 'az' ]")
    WebElement sorterAZ;
    @FindBy(css = "[value = 'za' ]")
    WebElement sorterZA;
    @FindBy(css = "[value = 'lohi' ]")
    WebElement sorterLOHI;
    @FindBy(css = "[value = 'hilo' ]")
    WebElement sorterHILO;

    List <String> sorterContainer1 = new ArrayList<>();
    List <String> sorterContainer2 = new ArrayList<>();
    List <String> sorterContainer3 = new ArrayList<>();
    List <String> sorterContainer4 = new ArrayList<>();

    public SortersInventoryPage(WebDriver driver) {
        super(driver);
    }

    public SortersInventoryPage sorterAZ () {
        sorterAZ.click();
    List <WebElement> elements = driver.findElements(By.cssSelector("[class='inventory_item_name']"));

        for (WebElement element : elements) {
            String text = element.getText();
            sorterContainer1.add(text);
        }
        return this;
    }

    public SortersInventoryPage sorterZA () {
        sorterZA.click();
        List <WebElement> elements = driver.findElements(By.cssSelector("[class='inventory_item_name']"));

        for (WebElement element : elements) {
            String text = element.getText();
            sorterContainer2.add(text);
        }
        return this;
    }

    public SortersInventoryPage sorterLOHI () {
        sorterLOHI.click();
        List <WebElement> elements = driver.findElements(By.cssSelector("[class='inventory_item_name']"));

        for (WebElement element : elements) {
            String text = element.getText();
            sorterContainer3.add(text);
        }
        return this;
    }

    public SortersInventoryPage sorterHILO () {
        sorterHILO.click();
        List <WebElement> elements = driver.findElements(By.cssSelector("[class='inventory_item_name']"));

        for (WebElement element : elements) {
            String text = element.getText();
            sorterContainer4.add(text);
        }
        return this;
    }
    public SortersInventoryPage compareSorters () {
        List<String> a1 = sorterContainer1;
        List<String> a2 = sorterContainer2;
        List<String> a3 = sorterContainer3;
        List<String> a4 = sorterContainer4;

        assertThat(a2.stream().sorted().collect(Collectors.toList()), equalTo(a1));
        assertThat(a3.stream().sorted().collect(Collectors.toList()), equalTo(a1));
        assertThat(a4.stream().sorted().collect(Collectors.toList()), equalTo(a1));
        return this;
    }



}
