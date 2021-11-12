// Page URL: https://app.heroh.africa/
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebForm extends PageObject{

    private final String LOGIN_USERNAME = "antond";
    private final String LOGIN_PASSWORD = "p@ssword";

    @FindBy(id = "login-MainForm:j_idt22")
    private WebElement login_username;

    @FindBy(id = "login-MainForm:j_idt24")
    private WebElement login_password;

    //@FindBy(xpath = "//a[contains(text(),'Submit')]")
    //private WebElement submit_button;
    @FindBy(id = "login-MainForm:j_idt26")
    private WebElement login_button;

    //@FindBy(xpath = "//div[contains(text(),'The form was successfully submitted!')]")
    //private WebElement alertSuccess;
    @FindBy(id = "j_idt2131:j_idt2135")
    private WebElement alertSuccess;

    @FindBy(xpath = "/html/body/div[3]/form[9]/div/div[1]/img")
    private WebElement burger_menu;
    @FindBy(xpath = "/html/body/div[3]/form[9]/div/div[1000]/img")
    private WebElement burger_menu2;

    @FindBy(xpath = "/html/body/div[3]/div[12]/div[2]/form/div[1]/div[1]/a/img")
    private WebElement page_back;




    //Main Menu list selections

    @FindBy(xpath = "/html/body/div[3]/div[11]/form[1]/div/div[1]/div/button")
    private WebElement mainMenu_button_HomePage;

    @FindBy(xpath = "/html/body/div[3]/div[11]/form[1]/div/div[1]/div/div[2]")
    private WebElement mainMenu_button_HealthRecords;

    @FindBy(xpath = "/html/body/div[3]/div[11]/form[1]/div/div[1]/div/div[3]")
    private WebElement mainMenu_button_Reports;

    @FindBy(xpath = "/html/body/div[3]/div[11]/form[1]/div/div[1]/div/div[4]")
    private WebElement mainMenu_button_Company;

    @FindBy(xpath = "/html/body/div[3]/div[11]/form[1]/div/div[1]/div/div[5]")
    private WebElement mainMenu_button_User;

    @FindBy(xpath = "/html/body/div[3]/div[11]/form[1]/div/div[1]/div/div[6]")
    private WebElement mainMenu_button_Help;

    @FindBy(xpath = "/html/body/div[3]/div[11]/form[1]/div/div[1]/div/div[7]")
    private WebElement mainMenu_button_Administration;

    @FindBy(xpath = "/html/body/div[3]/div[11]/form[1]/div/div[1]/div/div[8]")
    private WebElement mainMenu_button_Close;




    //Menu items - Health Record

    @FindBy(xpath = "/html/body/div[3]/div[11]/form[2]/div/div[1]/div/button[1]")
    private WebElement healthRecord_menu_Employees;

    @FindBy(xpath = "/html/body/div[3]/div[11]/form[2]/div/div[1]/div/button[2]")
    private WebElement healthRecord_menu_FormSearch;

    @FindBy(xpath = "/html/body/div[3]/div[11]/form[2]/div/div[1]/div/button[3]")
    private WebElement healthRecord_menu_cofSearch;

    @FindBy(xpath = "/html/body/div[3]/div[11]/form[2]/div/div[1]/div/div[3]")
    private WebElement healthRecord_menu_backButton;

    private final String EMPLOYEE_SEARCH_BAR_IDENTIFICATION = "1111111111";
    @FindBy(xpath = "/html/body/div[3]/div[12]/div[1]/form/table/tbody/tr[2]/td[2]/input")
    private WebElement healthRecord_menu_Employees_Search_Identification;

    @FindBy(xpath = "/html/body/div[3]/div[12]/div[1]/form/table/tbody/tr[3]/td[2]/div")
    private WebElement healthRecord_menu_Employees_Search_DropDown_IdType;





    //Menu items - Reports

    @FindBy(xpath = "/html/body/div[3]/div[11]/form[3]/div/div[1]/div/button[1]")
    private WebElement reports_menu_standardReports;

    @FindBy(xpath = "/html/body/div[3]/div[11]/form[3]/div/div[1]/div/button[3]")
    private WebElement reports_menu_cofStatistics;

    @FindBy(xpath = "/html/body/div[3]/div[11]/form[3]/div/div[1]/div/button[4]")
    private WebElement reports_menu_diseaseReport;

    @FindBy(xpath = "/html/body/div[3]/div[11]/form[3]/div/div[1]/div/div[3]")
    private WebElement reports_menu_backButton;




    //Menu items - Company

    @FindBy(xpath = "/html/body/div[3]/div[11]/form[4]/div/div[1]/div/div[3]")
    private WebElement company_menu_backButton;



    //Menu items - User

    @FindBy(xpath = "/html/body/div[3]/div[11]/form[5]/div/div[1]/div/button[2]")
    private WebElement user_menu_mySignature;

    @FindBy(xpath = "/html/body/div[3]/div[11]/form[5]/div/div[1]/div/div[3]")
    private WebElement user_menu_backButton;



    //Menu items - Help

    @FindBy(xpath = "/html/body/div[3]/div[11]/form[6]/div/div[1]/div/button[3]")
    private WebElement help_menu_support;

    @FindBy(xpath = "/html/body/div[3]/div[11]/form[6]/div/div[1]/div/button[4]")
    private WebElement help_menu_document;

    @FindBy(xpath = "/html/body/div[3]/div[11]/form[6]/div/div[1]/div/button[5]")
    private WebElement help_menu_termsConditions;

    @FindBy(xpath = "/html/body/div[3]/div[11]/form[6]/div/div[1]/div/div[3]")
    private WebElement help_menu_backButton;

    @FindBy(xpath ="/html/body/div[3]/div[12]/div[1]/div/div[2]/div/div/form/div/div/div/div/table/tbody/tr[1]/td[3]/button")
    private WebElement help_menu_document_download_AdminOffice;
    @FindBy(xpath ="/html/body/div[3]/div[12]/div[1]/div/div[2]/div/div/form/div/div/div/div/table/tbody/tr[2]/td[3]/button")
    private WebElement help_menu_document_download_Drivers;
    @FindBy(xpath ="/html/body/div[3]/div[12]/div[1]/div/div[2]/div/div/form/div/div/div/div/table/tbody/tr[3]/td[3]/button")
    private WebElement help_menu_document_download_FoodHandler;
    @FindBy(xpath ="/html/body/div[3]/div[12]/div[1]/div/div[2]/div/div/form/div/div/div/div/table/tbody/tr[4]/td[3]/button")
    private WebElement help_menu_document_download_HeatCold;
    @FindBy(xpath ="/html/body/div[3]/div[12]/div[1]/div/div[2]/div/div/form/div/div/div/div/table/tbody/tr[5]/td[3]/button")
    private WebElement help_menu_document_download_Lead;
    @FindBy(xpath ="/html/body/div[3]/div[12]/div[1]/div/div[2]/div/div/form/div/div/div/div/table/tbody/tr[6]/td[3]/button")
    private WebElement help_menu_document_download_ManufacturingEngineering;
    @FindBy(xpath ="/html/body/div[3]/div[12]/div[1]/div/div[2]/div/div/form/div/div/div/div/table/tbody/tr[7]/td[3]/button")
    private WebElement help_menu_document_download_Mining;
    @FindBy(xpath ="/html/body/div[3]/div[12]/div[1]/div/div[2]/div/div/form/div/div/div/div/table/tbody/tr[8]/td[3]/button")
    private WebElement help_menu_document_download_Radiation;
    @FindBy(xpath ="/html/body/div[3]/div[12]/div[1]/div/div[2]/div/div/form/div/div/div/div/table/tbody/tr[9]/td[3]/button")
    private WebElement help_menu_document_download_Seafarers;
    @FindBy(xpath ="/html/body/div[3]/div[12]/div[1]/div/div[2]/div/div/form/div/div/div/div/table/tbody/tr[10]/td[3]/button")
    private WebElement help_menu_document_download_Secutity;



    //Menu items - Administration

    @FindBy(xpath = "/html/body/div[3]/div[11]/form[7]/div/div[1]/div/button[1]")
    private WebElement admin_menu_companyAdmin;

    @FindBy(xpath = "/html/body/div[3]/div[11]/form[7]/div/div[1]/div/button[2]")
    private WebElement admin_menu_userAdmin;

    @FindBy(xpath = "/html/body/div[3]/div[11]/form[7]/div/div[1]/div/button[3]")
    private WebElement admin_menu_bulkUpload;

    @FindBy(xpath = "/html/body/div[3]/div[11]/form[7]/div/div[1]/div/button[4]")
    private WebElement admin_menu_documentUpload;

    @FindBy(xpath = "/html/body/div[3]/div[11]/form[7]/div/div[1]/div/button[5]")
    private WebElement admin_menu_scriptSearch;

    @FindBy(xpath = "/html/body/div[3]/div[11]/form[7]/div/div[1]/div/button[6]")
    private WebElement admin_menu_supportAdmin;

    @FindBy(xpath = "/html/body/div[3]/div[11]/form[7]/div/div[1]/div/button[7]")
    private WebElement admin_menu_groupAdmin;

    @FindBy(xpath = "/html/body/div[3]/div[11]/form[7]/div/div[1]/div/div[3]")
    private WebElement admin_menu_backButton;



    //Home page - Dashboard items

    @FindBy(xpath = "/html/body/div[3]/div[12]/div[1]/div/div[2]/form/div/div/div[1]/div/canvas")
    private WebElement home_dashboard_CofStatus;

    @FindBy(xpath = "/html/body/div[3]/div[12]/div[1]/div/div[2]/form/div/div/div[2]/div/canvas")
    private WebElement home_dashboard_medicalFormStatus;

    @FindBy(xpath = "/html/body/div[3]/div[12]/div[1]/div/div[2]/form/div/div/div[3]/div/div[2]/table/tbody/tr[1]")
    private WebElement home_dashboard_mediaclEvaluations;

    @FindBy(xpath = "/html/body/div[3]/div[12]/div[1]/div/div[2]/form/div/div/div[4]/div/div[2]")
    private WebElement home_dashboard_incidentList;

    @FindBy(xpath = "/html/body/div[3]/div[12]/div[1]/div/div[2]/form/div/div/div[7]/div[1]/a/span")
    private WebElement home_dashboard_draftCof;

    @FindBy(xpath = "/html/body/div[3]/div[12]/div[1]/div/div[2]/form/div/div/div[7]/div[2]/a/span")
    private WebElement home_dashboard_draftMedical;

    @FindBy(xpath = "/html/body/div[3]/div[12]/div[1]/div/div[6]/div/div[1]/a/img")
    private WebElement home_dashboard_webLinkDepartmentHealth;

    @FindBy(xpath = "/html/body/div[3]/div[12]/div[1]/div/div[6]/div/div[2]/a/img")
    private WebElement home_dashboard_webLinkDoctorReferenceInformation;

    @FindBy(xpath = "/html/body/div[3]/div[12]/div[1]/div/div[6]/div/div[2]/a/img")
    private WebElement home_dashboard_webLinkHazardousChemicals;

    @FindBy(xpath = "/html/body/div[3]/div[12]/div[1]/div/div[6]/div/div[4]/a/img")
    private WebElement home_dashboard_webLinkPatientInformation;




    //Login
    public WebForm(WebDriver driver) {
        super(driver);
    }
    public void enterUsername(){this.login_username.sendKeys(LOGIN_USERNAME);}
    public void enterPassword(){
        this.login_password.sendKeys(LOGIN_PASSWORD);
    }
    public void pressLoginButton(){
        this.login_button.click();
    }
    public void verifyAlertSuccess(){
        this.alertSuccess.isDisplayed();
    }

    //Hamburger Menu
    public void pressHamburgerMenu(){ this.burger_menu.click(); }
    public void pressHamburgerMenuFailed(){ this.burger_menu2.click(); }
    //Page Navigation
    public void pressPageBack(){ this.page_back.click(); }

    //Main Menu
    public void pressMainMenuHomePage(){ this.mainMenu_button_HomePage.click(); }
    public void pressMainMenuHealthRecords() {this.mainMenu_button_HealthRecords.click();}
    public void pressMainMenuReports() {this.mainMenu_button_Reports.click();}
    public void pressMainMenuCompany() {this.mainMenu_button_Company.click();}
    public void pressMainMenuUser() {this.mainMenu_button_User.click();}
    public void pressMainMenuHelp() {this.mainMenu_button_Help.click();}
    public void pressMainMenuAdministration() {this.mainMenu_button_Administration.click();}

    //Health Records
    public void pressHealthRecordMenuEmployees() {this.healthRecord_menu_Employees.click();}
    public void pressHealthRecordMenuFormSearch() {this.healthRecord_menu_FormSearch.click();}
    public void pressHealthRecordMenuCofSearch() {this.healthRecord_menu_cofSearch.click();}
    public void pressHealthRecordMenuBackButton() {this.healthRecord_menu_backButton.click();}
    public void enterEmployeeSearchIdentification(){this.healthRecord_menu_Employees_Search_Identification.sendKeys(EMPLOYEE_SEARCH_BAR_IDENTIFICATION);}
    public void enterEmployeeSearchDropDownSelectIdType(){this.healthRecord_menu_Employees_Search_DropDown_IdType.click();}

    //Reports
    public void pressReportsMenuStandardReport() {this.reports_menu_standardReports.click();}
    public void pressReportsMenuCofStatistics() {this.reports_menu_cofStatistics.click();}
    public void pressReportsMenuDiseaseReport() {this.reports_menu_diseaseReport.click();}
    public void pressReportsMenuBackButton() {this.reports_menu_backButton.click();}

    //Company
    public void pressCompanyMenuBackButton() {this.company_menu_backButton.click();}

    //User
    public void pressUserMenuMySignature() {this.user_menu_mySignature.click();}
    public void pressUserMenuBackButton() {this.user_menu_backButton.click();}

    //Help
    public void pressHelpMenuSupport() {this.help_menu_support.click();}
    public void pressHelpMenuDocument() {this.help_menu_document.click();}
    public void pressHelpMenuTermsConditions() {this.help_menu_termsConditions.click();}
    public void pressHelpMenuBackButton() {this.help_menu_backButton.click();}

    public void downloadHelpDocumentsAdministrationOffice() {this.help_menu_document_download_AdminOffice.click();}
    public void downloadHelpDocumentsDrivers() {this.help_menu_document_download_Drivers.click();}
    public void downloadHelpDocumentsFoodHandler() {this.help_menu_document_download_FoodHandler.click();}
    public void downloadHelpDocumentsHeatCold() {this.help_menu_document_download_HeatCold.click();}
    public void downloadHelpDocumentsLead() {this.help_menu_document_download_Lead.click();}
    public void downloadHelpDocumentsManufacturingEngineering() {this.help_menu_document_download_ManufacturingEngineering.click();}
    public void downloadHelpDocumentsMining() {this.help_menu_document_download_Mining.click();}
    public void downloadHelpDocumentsRadiation() {this.help_menu_document_download_Radiation.click();}
    public void downloadHelpDocumentsSeafarers() {this.help_menu_document_download_Seafarers.click();}
    public void downloadHelpDocumentsSecurity() {this.help_menu_document_download_Secutity.click();}

    //Administration
    public void pressAdminMenuCompanyAdmin() {this.admin_menu_companyAdmin.click();}
    public void pressAdminMenuUserAdmin() {this.admin_menu_userAdmin.click();}
    public void pressAdminMenuBulkUpload() {this.admin_menu_bulkUpload.click();}
    public void pressAdminMenuDocumentUpload() {this.admin_menu_documentUpload.click();}
    public void pressAdminMenuScriptSearch() {this.admin_menu_scriptSearch.click();}
    public void pressAdminMenuSupportAdmin() {this.admin_menu_supportAdmin.click();}
    public void pressAdminMenuGroupAdmin() {this.admin_menu_groupAdmin.click();}
    public void pressAdminMenuBackButton() {this.admin_menu_backButton.click();}

    //Dashboard
    public void pressHomeDashBoardCofStatus() {this.home_dashboard_CofStatus.click();}
    public void pressHomeDashBoardDraftCof() {this.home_dashboard_draftCof.click();}
    public void pressHomeDashBoardDraftMedical() {this.home_dashboard_draftMedical.click();}

    public void pressHomeDashBoardWebLinkDepartmentHealth() {this.home_dashboard_webLinkDepartmentHealth.click();}
    public void pressHomeDashBoardDoctorReferenceInformation() {this.home_dashboard_webLinkDoctorReferenceInformation.click();}
    public void pressHomeDashBoardHazardousChemicals() {this.home_dashboard_webLinkHazardousChemicals.click();}
    public void pressHomeDashBoardPatientInformation() {this.home_dashboard_webLinkPatientInformation.click();}

    //public void pressMainMenuClose() {this.mainMenu_button_.click();}


/*//https://www.youtube.com/watch?v=Tm1TeqdYrrI
    for(int i=0; i<list.size();i++){
        System.out.println(list.get(i).getText());
        if(list.get(i).getText().contain("passport")){
            list.get(i).click();
            break;
        }
    }*/
}