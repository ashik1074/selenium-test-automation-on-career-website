package com.labssqajobs.PageObject;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.sound.sampled.Port;
import java.security.PublicKey;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class MyAcc_MyProfile_Model {
    private WebDriver driver;
    public MyAcc_MyProfile_Model (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    //locators For Recruiter update Personal Info **************//
    @FindBy(xpath = "//a[@class='jet-auth-links__item' and @href='https://labsqajobs.qaharbor.com/account/']/span[text()='My account']")
    private WebElement myAccountLink;
    @FindBy(css = "#overlay div")
    private WebElement UploadPic;
    @FindBy(css = "input[data-form_id='12942']")
    private WebElement fileInputElement;
    @FindBy(xpath = "(//button[contains(text(), 'Update')])[4]")
    private WebElement update_btn;
    @FindBy(xpath = "(//div[@class='jet-button__container'])[2]")
    private WebElement edit_company;
    @FindBy(name = "_recruiter-company-site")
    private WebElement inputFieldName;
    @FindBy(id = "_recruiter-company-size")
    private WebElement dropdownSize;
    @FindBy(id = "_recruiter-company-industry")
    private WebElement CompanyType;
    @FindBy(id = "_recruiter-address")
    private WebElement Address;
    @FindBy(id = "_recruiter-country")
    private WebElement CompanyCountry;
    @FindBy(css = "button.jet-form-builder__action-button")
    private WebElement UpdateAll;
    @FindBy(xpath = "(//div[@class='jet-button__container'])[3]")
    private WebElement editAbout;
    @FindBy(css = "#_about-the-company")
    private WebElement aboutCompanyTextArea;
    @FindBy(css = "button.jet-form-builder__action-button[type='submit']")
    private WebElement submitButton;

    //Edit job
    @FindBy(xpath = "(//*[@fill=\"#178EE9\"])[4]")
    private WebElement editJob;
    @FindBy(id = "job-title")
    private WebElement Jobtitle;

    //*****locators For candidate update Personal Info **************//
    @FindBy(xpath = "//*[@fill=\"#178EE9\"]")
    private WebElement UpdateImage;
    @FindBy(id = "_candidate_avatar")
    private WebElement InputImage;
    @FindBy(id = "_candidate-first-name")
    private WebElement InputName;
    @FindBy(id="_candidate-last-name")
    private WebElement InputlastName;
    @FindBy(xpath = "(//button[contains(text(), 'Update')])[1]")
    private WebElement Updatebtn;
    @FindBy(xpath = "(//*[@fill=\"#178EE9\"])[3]")
    private WebElement UpdateContact;
    @FindBy(id = "_candidate-email")
    private WebElement upemailBtn;
   @FindBy(id = "_candidate-portfolio-link")
    private WebElement portfolioBtn;
   @FindBy(xpath = "(//button[contains(text(), 'Update')])[2]")
   private WebElement UpdateConBtn;
   @FindBy(xpath = "(//*[@fill=\"#178EE9\"])[2]")
   private WebElement editGeneral;
   @FindBy(id = "_candidate-experience")
   private WebElement experience;
   @FindBy(xpath = "(//button[@type=\'submit\' and text()= \'Save\'])")
   private WebElement saveBtn;
   @FindBy(xpath = "(//*[@fill=\"#178EE9\"])[4]")
   private  WebElement editCv;
    @FindBy(id ="_resume")
    private WebElement InputCV;
    @FindBy(xpath = "(//button[contains(text(), 'Update')])[3]")
    private WebElement updateCV;

    //--------Saved Jobs--------
    @FindBy(xpath = "(//*[text()='Saved Jobs'])[2]")
    private WebElement Savedjob;
    @FindBy(xpath = "(//span[@class='jet-listing-dynamic-link__label'])[2]")
    private WebElement JobDetails;
    @FindBy(xpath = "(//span[@class='elementor-button-text'])[1]")
    private WebElement morejobs;

    //----------Applied jobs-----------
    @FindBy(xpath = "(//*[text()='Jobs Applied'])")
     private WebElement appliedJobs;
    @FindBy(xpath = "(//*[text()='View'])")
    private WebElement viewApplied;
     public void updatePic_Candidate(String imagePath)
    {
        UpdateImage.click();
        InputImage.sendKeys(imagePath);
    }
    public void UpdateInfo_Candidate(String First,String last)
    {
       InputName.clear();
       InputName.sendKeys(First);
       InputlastName.clear();
       InputlastName.sendKeys(last);
       Updatebtn.click();
    }
    public void UpdateContact_Candidate(String Email,String Portfolio)
    {
       UpdateContact.click();
       upemailBtn.clear();
       upemailBtn.sendKeys(Email);
       portfolioBtn.clear();
       portfolioBtn.sendKeys(Portfolio);
       UpdateConBtn.click();
    }
    public void UpdateExperience_Candidate(String exp)
    {
        editGeneral.click();
        experience.clear();
        experience.sendKeys(exp);
        saveBtn.click();
    }
    public void UpdateResume_Candidate(String CVFile) throws InterruptedException {
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,50)");
     editCv.click();
     InputCV.sendKeys(CVFile);
     updateCV.click();
    }
    public void SavedJobs_Candidate()
    {
     Savedjob.click();
     JobDetails.click();
     morejobs.click();
     myAccountLink.click();
    }
    public void AppliedJobs_Candidate()
    {
        appliedJobs.click();
        viewApplied.click();
    }

    //--------------- For Recruiter ------------//
    public void uploadPicture(String imagePath) {
        UploadPic.click();
        fileInputElement.sendKeys(imagePath);
        update_btn.click();
    }
    public void EditCompanyProfile(String text) {
        edit_company.click();
        inputFieldName.clear();
        inputFieldName.sendKeys(text);
    }
    public void editCompanySize(String value) {
        Select select = new Select(dropdownSize);
        select.selectByVisibleText(value);
    }
    public void CompanyType(String text) {
        Select select = new Select(CompanyType);
        select.selectByVisibleText(text);
    }
    // Create a new Select object
    public void EditCompanyAddress(String text) {
    Address.clear();
    Address.sendKeys(text);
    }
    public void EditCompanyCountry(String text) {
        Select select = new Select(CompanyCountry);
        select.selectByVisibleText(text);
        UpdateAll.click();
    }
    public void editCompanyDescription(String text) throws InterruptedException {
        Thread.sleep(1000);
        editAbout.click();
        Thread.sleep(1000);
        aboutCompanyTextArea.clear();
        Thread.sleep(1000);
        aboutCompanyTextArea.sendKeys(text);
        Thread.sleep(1000);
        submitButton.click();
    }
    public void editPostedJob(String Text) throws InterruptedException {
        Thread.sleep(1000);
        editJob.click();
        Jobtitle.clear();
        Jobtitle.sendKeys(Text);
    }



}









