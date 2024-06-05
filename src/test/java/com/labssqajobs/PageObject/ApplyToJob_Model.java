package com.labssqajobs.PageObject;

import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplyToJob_Model {
    private WebDriver driver;
    public ApplyToJob_Model(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    //locators
    @FindBy(xpath = "(//span[@class='jet-listing-dynamic-link__label'])[4]")
    private WebElement JobBtn2;
    @FindBy(css = "a.jet-breadcrumbs__item-link")
    private WebElement Home_btn;//after login
    @FindBy(css = "h2.elementor-heading-title.elementor-size-default")
    private WebElement applyNowButton;
    public void Applyjob() throws InterruptedException {
        Home_btn.click();
        Thread.sleep(1000);
        JobBtn2.click();
        Thread.sleep(1000);
        applyNowButton.click();
    }

}
