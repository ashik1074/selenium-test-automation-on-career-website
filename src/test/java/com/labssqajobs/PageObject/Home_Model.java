package com.labssqajobs.PageObject;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Home_Model
{
    private WebDriver driver;
    public Home_Model(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    //locators
    @FindBy(xpath = "//input[@class='jet-search-filter__input']")
    private WebElement searchInput;
    @FindBy(xpath = "//button[@class='apply-filters__button' and @type='button']")
    private WebElement SearchButton;

    @FindBy(css = "a.jet-breadcrumbs__item-link")
    private WebElement Home_btn;//after login
    //select dropdown
    @FindBy(css = "select.jet-select__control")
    private WebElement dropdownElement;
   @FindBy (xpath= "//span[@class='jet-listing-dynamic-link__label']")
   private WebElement SQA_job;

   @FindBy(css ="h2.elementor-heading-title")
   private WebElement Apply_now;
   @FindBy(xpath=" (//span[@class='elementor-button-text'])[1]")
   private WebElement Details;

   @FindBy(css = "button.jet-remove-all-filters__button")
    private WebElement clearAllButton;
   @FindBy(xpath = "(//span[@class='jet-button__label'])[3]")
   private WebElement SeeAll;
    //constructors
    //Search text
    public void enterSearchText(String searchText)
    {
        searchInput.sendKeys(searchText);
    }
    public void Search(String searchText) throws InterruptedException {
        Home_btn.click();
        Thread.sleep(1000);
        searchInput.click();
        searchInput.sendKeys(searchText);
        Thread.sleep(1000);
        SearchButton.click();
        Thread.sleep(1000);
        clearAllButton.click();
    }
    public void selectOption(String optionText) throws InterruptedException {
        Home_btn.click();
        dropdownElement.click();
        Thread.sleep(1000);
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText(optionText);
        Thread.sleep(1000);
        SearchButton.click();
        Thread.sleep(1000);
        clearAllButton.click();
    }
    public void JobDetails() throws InterruptedException {
        Home_btn.click();
        Thread.sleep(1000);
        SQA_job.click();
        Thread.sleep(1000);
        Details.click();

    }
}

