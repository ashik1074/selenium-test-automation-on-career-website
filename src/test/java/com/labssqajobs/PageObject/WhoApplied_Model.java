package com.labssqajobs.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WhoApplied_Model {
    private WebDriver driver;

    public WhoApplied_Model(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
     //locators
    @FindBy(css = "a.jet-profile-menu__item-link[href='https://labsqajobs.qaharbor.com/account/who-applied/']")
    private WebElement WhoApplied_Btn;
    @FindBy(css = ".elementor-jet-download-button.jet-elements span")
    private WebElement downloadResume;
    @FindBy(xpath = "//span[@class='jet-listing-dynamic-link__label']")
    private WebElement Candidate_profile;
    public void WhoApplied() throws InterruptedException {
        WhoApplied_Btn.click();
        Thread.sleep(1000);
    }
    public void CandidateDetails() throws InterruptedException {
        WhoApplied_Btn.click();
        Candidate_profile.click();
        Thread.sleep(1000);
    }
    public void Download() throws InterruptedException {
        WhoApplied_Btn.click();
        Candidate_profile.click();
        Thread.sleep(1000);
        downloadResume.click();
    }
}
