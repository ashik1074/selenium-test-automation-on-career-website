package com.labssqajobs.TestCases_Recruiter.MyProfile;

import com.labssqajobs.PageObject.MyAcc_MyProfile_Model;
import com.labssqajobs.TestCases_Recruiter.TC_LoginPage;
import org.testng.annotations.Test;

public class Successfully_Update_companyProfile extends TC_LoginPage
{
    @Test(priority = 2)
    public void Successfuly_Edit_Company() {
        MyAcc_MyProfile_Model EditCompanyInfo = new MyAcc_MyProfile_Model(driver);
        EditCompanyInfo.EditCompanyProfile("QA HARBOR LIMITED");
    }
    @Test(priority = 3)
    public void successfulEditCompanySize() {
        MyAcc_MyProfile_Model companySize = new MyAcc_MyProfile_Model(driver);
        companySize.editCompanySize("50-100");
    }
    @Test(priority = 4)
    public void successfulEditCompanyType() {
        MyAcc_MyProfile_Model companytype = new MyAcc_MyProfile_Model(driver);
        companytype.CompanyType("Real Estate");
    }
    @Test(priority = 5)
    public void SuccessfulEditAddress() {
        MyAcc_MyProfile_Model CompanyAddress = new MyAcc_MyProfile_Model(driver);
        CompanyAddress.EditCompanyAddress("Dhaka Bangladesh");
    }
    @Test(priority = 6)
    public void successfulEditCompanyCountry() {
        MyAcc_MyProfile_Model companyCountry = new MyAcc_MyProfile_Model(driver);
        companyCountry.EditCompanyCountry("Zambia");
    }
}

