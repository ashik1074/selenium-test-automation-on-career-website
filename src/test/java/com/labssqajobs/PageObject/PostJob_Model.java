package com.labssqajobs.PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PostJob_Model {
    private WebDriver driver;
    public PostJob_Model(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[text()=\"Post a Job\"]\n")
    private WebElement PostJob_btn;
   @FindBy(id = "job-title")
    private WebElement JobTitle;
    @FindBy(css = "iframe[title='Rich Text Area\\. Press Alt-Shift-H for help\\.']")
    private WebElement iframe;
    @FindBy(tagName = "body")
    private WebElement descriptionInput;
    @FindBy(xpath = "//*[text()='Salary Range']")
    private WebElement salaryType;
    @FindBy(id = "select2-_job-currency-container")
    private WebElement currecnyType;
    @FindBy(xpath = "//li[contains(text(),'Bangladeshi Taka (BDT)')]")
    private WebElement BDTSelect;
    @FindBy(id = "_salary")
    private WebElement range;
    @FindBy(xpath = "//*[text()=\"On Site\"]")
    private  WebElement Jobtype;
    @FindBy(id = "select2-_vacancy-country-container")
    private WebElement countrydrop;
    @FindBy(xpath = "//li[contains(text(),'Bangladesh')]")
    private WebElement country;
    @FindBy(id = "_job-city")
    private WebElement jobCity;
    @FindBy(id = "select2-_job-time-zone-container")
    private WebElement Timezone;
    @FindBy(xpath = "//li[contains(text(),'UTC-12')]")
    private WebElement UTCselect;
    @FindBy(xpath = "//*[text()=\"Full Time\"]")
    private WebElement JobType;
    @FindBy(id= "_job-vacancy")
    private WebElement Vacancy;
    @FindBy(xpath="//*[text()=\"Automation Tester\"]")
    private WebElement TesterType;
    @FindBy(id = "_job-application-deadline")
    private WebElement Deadline;
    @FindBy(css = "button.jet-form-builder__action-button.jet-form-builder__submit")
    private WebElement SubmitBtn;

    @FindBy(xpath = "//*[text()= 'My Account']")
    private WebElement MyAccBtn;
    public void Successjobpost(String Title ,String desc,String Amount,String city,String number,String date) throws InterruptedException {
        PostJob_btn.click();
    Thread.sleep(1000);
        JobTitle.click();
        JobTitle.sendKeys(Title);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");
        //job description
        driver.switchTo().frame(iframe);
        descriptionInput.click();
        descriptionInput.sendKeys(desc);
        // Switch back to default content
        driver.switchTo().defaultContent();
        js.executeScript("window.scrollBy(200,300)");

        salaryType.click();
        currecnyType.click();
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(200,300)");

        BDTSelect.click();
        range.sendKeys(Amount);
        Jobtype.click();
        countrydrop.click();
        Thread.sleep(1000);
        country.click();
        jobCity.sendKeys(city);

        Timezone.click();
        Thread.sleep(1000);
        UTCselect.click();
        JobType.click();
        Thread.sleep(1000);
        Vacancy.click();
        Vacancy.clear();
        Vacancy.sendKeys(number);
        Thread.sleep(1000);
        TesterType.click();
        Thread.sleep(1000);
        Deadline.click();
        Deadline.clear();
        Deadline.sendKeys(date);
        Thread.sleep(1000);
        SubmitBtn.click();
        MyAccBtn.click();
        js.executeScript("window.scrollBy(0,300)");
    }

    public void TitleBlank(String desc,String Amount,String city,String number,String date) throws InterruptedException {
        PostJob_btn.click();
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");
        //job description
        driver.switchTo().frame(iframe);
        descriptionInput.click();
        descriptionInput.sendKeys(desc);
        // Switch back to default content
        driver.switchTo().defaultContent();
        js.executeScript("window.scrollBy(200,300)");

        salaryType.click();
        currecnyType.click();
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(200,300)");

        BDTSelect.click();
        range.sendKeys(Amount);
        Jobtype.click();
        countrydrop.click();
        Thread.sleep(1000);
        country.click();
        jobCity.sendKeys(city);

        Timezone.click();
        Thread.sleep(1000);
        UTCselect.click();
        JobType.click();
        Thread.sleep(1000);
        Vacancy.click();
        Vacancy.clear();
        Vacancy.sendKeys(number);
        Thread.sleep(1000);
        TesterType.click();
        Thread.sleep(1000);
        Deadline.click();
        Deadline.clear();
        Deadline.sendKeys(date);
        Thread.sleep(1000);
        SubmitBtn.click();
    }
    public void DescriptionBlank(String Title ,String Amount,String city,String number,String date) throws InterruptedException {

        PostJob_btn.click();
        Thread.sleep(1000);
        JobTitle.click();
        JobTitle.sendKeys(Title);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");
        //job description


        salaryType.click();
        currecnyType.click();
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(200,300)");

        BDTSelect.click();
        range.sendKeys(Amount);
        Jobtype.click();
        countrydrop.click();
        Thread.sleep(1000);
        country.click();
        jobCity.sendKeys(city);

        Timezone.click();
        Thread.sleep(1000);
        UTCselect.click();
        JobType.click();
        Thread.sleep(1000);
        Vacancy.click();
        Vacancy.clear();
        Vacancy.sendKeys(number);
        Thread.sleep(1000);
        TesterType.click();
        Thread.sleep(1000);
        Deadline.click();
        Deadline.clear();
        Deadline.sendKeys(date);
        Thread.sleep(1000);
        SubmitBtn.click();
    }
    public void CityBlank(String Title ,String desc,String Amount,String number,String date) throws InterruptedException {
        PostJob_btn.click();
        Thread.sleep(1000);
        JobTitle.click();
        JobTitle.sendKeys(Title);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");
        //job description
        driver.switchTo().frame(iframe);
        descriptionInput.click();
        descriptionInput.sendKeys(desc);
        // Switch back to default content
        driver.switchTo().defaultContent();
        js.executeScript("window.scrollBy(200,300)");

        salaryType.click();
        currecnyType.click();
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(200,300)");

        BDTSelect.click();
        range.sendKeys(Amount);
        Jobtype.click();
        countrydrop.click();
        Thread.sleep(1000);
        country.click();

        Timezone.click();
        Thread.sleep(1000);
        UTCselect.click();
        JobType.click();
        Thread.sleep(1000);
        Vacancy.click();
        Vacancy.clear();
        Vacancy.sendKeys(number);
        Thread.sleep(1000);
        TesterType.click();
        Thread.sleep(1000);
        Deadline.click();
        Deadline.clear();
        Deadline.sendKeys(date);
        Thread.sleep(1000);
        SubmitBtn.click();
    }
    public void SalaryTypeBlank(String Title ,String desc,String Amount,String city,String number,String date) throws InterruptedException {
        PostJob_btn.click();
        Thread.sleep(1000);
        JobTitle.click();
        JobTitle.sendKeys(Title);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");
        //job description
        driver.switchTo().frame(iframe);
        descriptionInput.click();
        descriptionInput.sendKeys(desc);
        // Switch back to default content
        driver.switchTo().defaultContent();
        js.executeScript("window.scrollBy(200,300)");

        Jobtype.click();
        countrydrop.click();
        Thread.sleep(1000);
        country.click();
        jobCity.sendKeys(city);

        Timezone.click();
        Thread.sleep(1000);
        UTCselect.click();
        JobType.click();
        Thread.sleep(1000);
        Vacancy.click();
        Vacancy.clear();
        Vacancy.sendKeys(number);
        Thread.sleep(1000);
        TesterType.click();
        Thread.sleep(1000);
        Deadline.click();
        Deadline.clear();
        Deadline.sendKeys(date);
        Thread.sleep(1000);
        SubmitBtn.click();
    }
    public void vacancyBlank(String Title ,String desc,String Amount,String city,String number,String date) throws InterruptedException {
        PostJob_btn.click();
        Thread.sleep(1000);
        JobTitle.click();
        JobTitle.sendKeys(Title);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");
        //job description
        driver.switchTo().frame(iframe);
        descriptionInput.click();
        descriptionInput.sendKeys(desc);
        // Switch back to default content
        driver.switchTo().defaultContent();
        js.executeScript("window.scrollBy(200,300)");

        salaryType.click();
        currecnyType.click();
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(200,300)");

        BDTSelect.click();
        range.sendKeys(Amount);

        countrydrop.click();
        Thread.sleep(1000);
        country.click();
        jobCity.sendKeys(city);

        Timezone.click();
        Thread.sleep(1000);
        UTCselect.click();
        JobType.click();
        Thread.sleep(1000);
        Vacancy.click();
        Vacancy.clear();
        Vacancy.sendKeys(number);
        Thread.sleep(1000);
        TesterType.click();
        Thread.sleep(1000);
        Deadline.click();
        Deadline.clear();
        Deadline.sendKeys(date);
        Thread.sleep(1000);
        SubmitBtn.click();
    }
    public void countryBlank(String Title ,String desc,String Amount,String city,String number,String date) throws InterruptedException {
        PostJob_btn.click();
        Thread.sleep(1000);
        JobTitle.click();
        JobTitle.sendKeys(Title);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");
        //job description
        driver.switchTo().frame(iframe);
        descriptionInput.click();
        descriptionInput.sendKeys(desc);
        // Switch back to default content
        driver.switchTo().defaultContent();
        js.executeScript("window.scrollBy(200,300)");

        salaryType.click();
        currecnyType.click();
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(200,300)");

        BDTSelect.click();
        range.sendKeys(Amount);
        Jobtype.click();
        Thread.sleep(2000);
        jobCity.sendKeys(city);

        Timezone.click();
        Thread.sleep(1000);
        UTCselect.click();
        JobType.click();
        Thread.sleep(1000);
        Vacancy.click();
        Vacancy.clear();
        Vacancy.sendKeys(number);
        Thread.sleep(1000);
        TesterType.click();
        Thread.sleep(1000);
        Deadline.click();
        Deadline.clear();
        Deadline.sendKeys(date);
        Thread.sleep(1000);
        SubmitBtn.click();
    }

        public void Timezone(String Title ,String desc,String Amount,String city,String number,String date) throws InterruptedException {
            PostJob_btn.click();
            Thread.sleep(1000);
            JobTitle.click();
            JobTitle.sendKeys(Title);

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,200)");
            //job description
            driver.switchTo().frame(iframe);
            descriptionInput.click();
            descriptionInput.sendKeys(desc);
            // Switch back to default content
            driver.switchTo().defaultContent();
            js.executeScript("window.scrollBy(200,300)");

            salaryType.click();
            currecnyType.click();
            Thread.sleep(2000);
            js.executeScript("window.scrollBy(200,300)");

            BDTSelect.click();
            range.sendKeys(Amount);
            Jobtype.click();
            countrydrop.click();
            Thread.sleep(1000);
            country.click();
            jobCity.sendKeys(city);

            JobType.click();
            Thread.sleep(1000);
            Vacancy.click();
            Vacancy.clear();
            Vacancy.sendKeys(number);
            Thread.sleep(1000);
            TesterType.click();
            Thread.sleep(1000);
            Deadline.click();
            Deadline.clear();
            Deadline.sendKeys(date);
            Thread.sleep(1000);
            SubmitBtn.click();

        }
    public void vacancyStatusBlank(String Title ,String desc,String Amount,String city,String date) throws InterruptedException {
        PostJob_btn.click();
        Thread.sleep(1000);
        JobTitle.click();
        JobTitle.sendKeys(Title);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");
        //job description
        driver.switchTo().frame(iframe);
        descriptionInput.click();
        descriptionInput.sendKeys(desc);
        // Switch back to default content
        driver.switchTo().defaultContent();
        js.executeScript("window.scrollBy(200,300)");

        salaryType.click();
        currecnyType.click();
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(200,300)");

        BDTSelect.click();
        range.sendKeys(Amount);
        Jobtype.click();
        countrydrop.click();
        Thread.sleep(1000);
        country.click();
        jobCity.sendKeys(city);

        Timezone.click();
        Thread.sleep(1000);
        UTCselect.click();

        Thread.sleep(1000);
        TesterType.click();
        Thread.sleep(1000);
        Deadline.click();
        Deadline.clear();
        Deadline.sendKeys(date);
        Thread.sleep(1000);
        SubmitBtn.click();
    }
    public void CategoryBlank(String Title ,String desc,String Amount,String city,String number,String date) throws InterruptedException {
        PostJob_btn.click();
        Thread.sleep(1000);
        JobTitle.click();
        JobTitle.sendKeys(Title);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");
        //job description
        driver.switchTo().frame(iframe);
        descriptionInput.click();
        descriptionInput.sendKeys(desc);
        // Switch back to default content
        driver.switchTo().defaultContent();
        js.executeScript("window.scrollBy(200,300)");

        salaryType.click();
        currecnyType.click();
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(200,300)");

        BDTSelect.click();
        range.sendKeys(Amount);
        Jobtype.click();
        countrydrop.click();
        Thread.sleep(1000);
        country.click();
        jobCity.sendKeys(city);

        Timezone.click();
        Thread.sleep(1000);
        UTCselect.click();
        JobType.click();
        Thread.sleep(1000);
        Vacancy.click();
        Vacancy.clear();
        Vacancy.sendKeys(number);
        Thread.sleep(1000);

        Deadline.click();
        Deadline.clear();
        Deadline.sendKeys(date);
        Thread.sleep(1000);
        SubmitBtn.click();

    }
    public void DeadlineBlank(String Title ,String desc,String Amount,String city,String number) throws InterruptedException {
        PostJob_btn.click();
        Thread.sleep(1000);
        JobTitle.click();
        JobTitle.sendKeys(Title);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");
        //job description
        driver.switchTo().frame(iframe);
        descriptionInput.click();
        descriptionInput.sendKeys(desc);
        // Switch back to default content
        driver.switchTo().defaultContent();
        js.executeScript("window.scrollBy(200,300)");

        salaryType.click();
        currecnyType.click();
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(200,300)");

        BDTSelect.click();
        range.sendKeys(Amount);
        Jobtype.click();
        countrydrop.click();
        Thread.sleep(1000);
        country.click();
        jobCity.sendKeys(city);

        Timezone.click();
        Thread.sleep(1000);
        UTCselect.click();
        JobType.click();
        Thread.sleep(1000);
        Vacancy.click();
        Vacancy.clear();
        Vacancy.sendKeys(number);
        Thread.sleep(1000);
        TesterType.click();

        Thread.sleep(1000);
        SubmitBtn.click();
    }
    public void InvalidDate(String Title ,String desc,String Amount,String city,String number,String date) throws InterruptedException {
        PostJob_btn.click();
        Thread.sleep(1000);
        JobTitle.click();
        JobTitle.sendKeys(Title);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");
        //job description
        driver.switchTo().frame(iframe);
        descriptionInput.click();
        descriptionInput.sendKeys(desc);
        // Switch back to default content
        driver.switchTo().defaultContent();
        js.executeScript("window.scrollBy(200,300)");

        salaryType.click();
        currecnyType.click();
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(200,300)");

        BDTSelect.click();
        range.sendKeys(Amount);
        Jobtype.click();
        countrydrop.click();
        Thread.sleep(1000);
        country.click();
        jobCity.sendKeys(city);

        Timezone.click();
        Thread.sleep(1000);
        UTCselect.click();
        JobType.click();
        Thread.sleep(1000);
        Vacancy.click();
        Vacancy.clear();
        Vacancy.sendKeys(number);
        Thread.sleep(1000);
        TesterType.click();
        Thread.sleep(1000);
        Deadline.click();
        Deadline.clear();
        Deadline.sendKeys(date);
        Thread.sleep(1000);
        SubmitBtn.click();

    }
}


