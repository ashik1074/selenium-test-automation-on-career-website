package com.labssqajobs.PageObject;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Jobs_Model {
    private WebDriver driver;

    public Jobs_Model(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //locators
    @FindBy(xpath = "(//span[@class='jet-nav-link-text'])[1]")
    private WebElement JobsBtn;
    @FindBy(css = "select.jet-select__control[name='vacancy-category']")
    private WebElement categoryBtn;
    @FindBy(xpath = "//div[@class='jet-smart-filters-remove-filters jet-filter']")
    private WebElement clearAll;
    @FindBy(xpath = "//span[@class='jet-checkboxes-list__label' and text()='Remote']/preceding-sibling::span/i")
    private WebElement RemoteCheckbox;
    @FindBy(xpath = "//span[@class='jet-checkboxes-list__label' and text()='On Site']/preceding-sibling::span/i")
    private WebElement OnsiteCheckbox;
    @FindBy(xpath = "//span[@class='jet-checkboxes-list__label' and text()='Full Time']")
    private WebElement Fulltimebtn;
    @FindBy(xpath = "//span[@class='jet-checkboxes-list__label' and text()='Intern']")
    private WebElement InternBtn;
    @FindBy(xpath = "//span[@class='jet-checkboxes-list__label' and text()='Part Time']")
    private WebElement PartTimeBtn;

    public void selectCategory(String text) throws InterruptedException {
        Thread.sleep(1000);
        JobsBtn.click();
        categoryBtn.click();
        Thread.sleep(1000);
        Select select = new Select(categoryBtn);
        select.selectByVisibleText(text);
        Thread.sleep(1000);
        clearAll.click();
    }
    public void VacancyType1() throws InterruptedException {
        if (!RemoteCheckbox.isDisplayed()) {
            // Click on the checkbox to select it
            RemoteCheckbox.click();
            Thread.sleep(2000);
            clearAll.click();
            Thread.sleep(2000);
        }}
        public void VacancyType2() throws InterruptedException{
            JobsBtn.click();
            Thread.sleep(2000);
            if (!OnsiteCheckbox.isDisplayed()) {
                // Click on the checkbox to select it
                OnsiteCheckbox.click();
                Thread.sleep(2000);
                clearAll.click();
            }}
           public void VacancyStatus1() throws InterruptedException {
               JobsBtn.click();
               Thread.sleep(1000);
                Fulltimebtn.click();
                Thread.sleep(2000);
                clearAll.click();
            }
    public void VacancyStatus2() throws InterruptedException {
       InternBtn.click();
        Thread.sleep(2000);
        clearAll.click();
        Thread.sleep(2000);
    }
    public void VacancyStatus3() throws InterruptedException {

        PartTimeBtn.click();
        Thread.sleep(2000);
        clearAll.click();
        Thread.sleep(2000);
    }
    }



