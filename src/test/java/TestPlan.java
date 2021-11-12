import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestPlan
{
    private static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args)
    {
        // ChromeDriver location set up in Utils class
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }


    @Test(testName = "Submit a WebForm")
    public static void submitForm()
    {
        driver.get(Utils.BASE_URL);
        WebForm webForm = new WebForm(driver);
        webForm.enterUsername();
        webForm.enterPassword();
        webForm.pressLoginButton();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        webForm.verifyAlertSuccess();
        //driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        try {

        } catch (Exception e) {
            e.printStackTrace();
        }
        webForm.pressHamburgerMenu();
    }


    @Test(testName = "Log into Heroh")
    public static void siteLogin()
    {
        driver.get(Utils.BASE_URL);
        WebForm webForm = new WebForm(driver);
        webForm.enterUsername();
        webForm.enterPassword();
        webForm.pressLoginButton();
        webForm.pressHamburgerMenu();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        //webForm.verifyAlertSuccess();
    }


    @Test(testName = "Navigate through Menu SUPER FAST")
    public static void navigateMenuFast()
    {
        driver.get(Utils.BASE_URL);
        WebForm webForm = new WebForm(driver);
        webForm.enterUsername();
        webForm.enterPassword();
        webForm.pressLoginButton();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        webForm.verifyAlertSuccess();
        //driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        webForm.pressHamburgerMenu();
        webForm.pressMainMenuHomePage();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        webForm.pressHamburgerMenu();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        webForm.pressHamburgerMenu();
        webForm.pressMainMenuHealthRecords();
        webForm.pressHamburgerMenu();
        webForm.pressMainMenuReports();
        webForm.pressHamburgerMenu();
        webForm.pressMainMenuCompany();
        webForm.pressHamburgerMenu();
        webForm.pressMainMenuUser();
        webForm.pressHamburgerMenu();
        webForm.pressMainMenuHelp();
        webForm.pressHamburgerMenu();
        webForm.pressMainMenuAdministration();
    }


    @Test(testName = "Navigate through Menu")
    public void navigateMenu()
    {
        driver.get(Utils.BASE_URL);
        WebForm webForm = new WebForm(driver);
        webForm.enterUsername();
        webForm.enterPassword();
        webForm.pressLoginButton();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        webForm.verifyAlertSuccess();
        //driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        try {
            webForm.pressHamburgerMenu();
            System.out.println("hamburger press passed");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("hamburger button failed");
        }
        try {
            webForm.pressHamburgerMenuFailed();
            System.out.println("hamburger press passed");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("hamburger button failed");
        }
        webForm.pressHamburgerMenu();
        webForm.pressMainMenuHomePage();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        webForm.pressHamburgerMenu();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        this.delay(5000);
        webForm.pressHamburgerMenu();
        this.delay(1000);
        webForm.pressMainMenuHealthRecords();
        this.delay(5000);
        webForm.pressHamburgerMenu();
        this.delay(1000);
        webForm.pressMainMenuReports();
        this.delay(5000);
        webForm.pressHamburgerMenu();
        this.delay(1000);
        webForm.pressMainMenuCompany();
        this.delay(5000);
        webForm.pressHamburgerMenu();
        this.delay(1000);
        webForm.pressMainMenuUser();
        this.delay(5000);
        webForm.pressHamburgerMenu();
        this.delay(1000);
        webForm.pressMainMenuHelp();
        this.delay(5000);
        webForm.pressHamburgerMenu();
        this.delay(1000);
        webForm.pressMainMenuAdministration();
    }


    @Test(testName = "Navigate through Health Records")
    public void navigateMenuHealthRecords()
    {
        driver.get(Utils.BASE_URL);
        WebForm webForm = new WebForm(driver);
        webForm.enterUsername();
        webForm.enterPassword();
        webForm.pressLoginButton();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        webForm.verifyAlertSuccess();
        //driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        try {
            webForm.pressHamburgerMenu();
            System.out.println("hamburger press passed");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("hamburger button failed");
        }
        try {
            webForm.pressHamburgerMenuFailed();
            System.out.println("hamburger press passed");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("hamburger button failed");
        }
        webForm.pressHamburgerMenu();
        webForm.pressMainMenuHomePage();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        webForm.pressHamburgerMenu();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        this.delay(5000);
        webForm.pressHamburgerMenu();
        this.delay(1000);
        webForm.pressMainMenuHealthRecords();
        this.delay(5000);
        webForm.pressHealthRecordMenuEmployees();
        this.delay(5000);
        webForm.pressHamburgerMenu();
        this.delay(1000);
        webForm.pressMainMenuHealthRecords();
        this.delay(1000);
        webForm.pressHealthRecordMenuFormSearch();
        this.delay(5000);
        webForm.pressHamburgerMenu();
        this.delay(1000);
        webForm.pressMainMenuHealthRecords();
        this.delay(1000);
        webForm.pressHealthRecordMenuCofSearch();
        this.delay(5000);
        webForm.pressHamburgerMenu();
        this.delay(1000);
        webForm.pressMainMenuHealthRecords();
        this.delay(1000);
        webForm.pressHealthRecordMenuBackButton();
        this.delay(5000);
    }


    @Test(testName = "Navigate through Reports")
    public void navigateMenuReports()
    {
        driver.get(Utils.BASE_URL);
        WebForm webForm = new WebForm(driver);
        webForm.enterUsername();
        webForm.enterPassword();
        webForm.pressLoginButton();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        webForm.verifyAlertSuccess();
        //driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        try {
            webForm.pressHamburgerMenu();
            System.out.println("hamburger press passed");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("hamburger button failed");
        }
        try {
            webForm.pressHamburgerMenuFailed();
            System.out.println("hamburger press passed");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("hamburger button failed");
        }
        webForm.pressHamburgerMenu();
        webForm.pressMainMenuHomePage();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        webForm.pressHamburgerMenu();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        this.delay(5000);
        webForm.pressHamburgerMenu();
        this.delay(1000);
        webForm.pressMainMenuReports();
        this.delay(5000);
        webForm.pressReportsMenuStandardReport();
        this.delay(5000);
        webForm.pressHamburgerMenu();
        this.delay(1000);
        webForm.pressMainMenuReports();
        this.delay(1000);
        webForm.pressReportsMenuCofStatistics();
        this.delay(5000);
        webForm.pressHamburgerMenu();
        this.delay(1000);
        webForm.pressMainMenuReports();
        this.delay(1000);
        webForm.pressReportsMenuDiseaseReport();
        this.delay(5000);
        webForm.pressHamburgerMenu();
        this.delay(1000);
        webForm.pressMainMenuReports();
        this.delay(1000);
        webForm.pressReportsMenuBackButton();
        this.delay(5000);
        //driver.quit();
    }


    @Test(testName = "Navigate through Company", enabled = true)
    public void navigateMenuCompany()
    {
        driver.get(Utils.BASE_URL);
        WebForm webForm = new WebForm(driver);
        webForm.enterUsername();
        webForm.enterPassword();
        webForm.pressLoginButton();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        webForm.verifyAlertSuccess();
        //driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        try {
            webForm.pressHamburgerMenu();
            System.out.println("hamburger press passed");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("hamburger button failed");
        }
        try {
            webForm.pressHamburgerMenuFailed();
            System.out.println("hamburger press passed");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("hamburger button failed");
        }
        webForm.pressHamburgerMenu();
        webForm.pressMainMenuHomePage();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        webForm.pressHamburgerMenu();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        this.delay(5000);
        webForm.pressHamburgerMenu();
        this.delay(1000);
        webForm.pressMainMenuCompany();
        this.delay(5000);
        webForm.pressCompanyMenuBackButton();
        this.delay(5000);
        //driver.quit();
    }


    @Test(testName = "Navigate through User", enabled = true)
    public void navigateMenuUser()
    {
        driver.get(Utils.BASE_URL);
        WebForm webForm = new WebForm(driver);
        webForm.enterUsername();
        webForm.enterPassword();
        webForm.pressLoginButton();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        webForm.verifyAlertSuccess();
        //driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        try {
            webForm.pressHamburgerMenu();
            System.out.println("hamburger press passed");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("hamburger button failed");
        }
        try {
            webForm.pressHamburgerMenuFailed();
            System.out.println("hamburger press passed");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("hamburger button failed");
        }
        webForm.pressHamburgerMenu();
        webForm.pressMainMenuHomePage();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        webForm.pressHamburgerMenu();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        this.delay(5000);
        webForm.pressHamburgerMenu();
        this.delay(1000);
        webForm.pressMainMenuUser();
        this.delay(5000);
        webForm.pressUserMenuMySignature();
        this.delay(5000);
        webForm.pressHamburgerMenu();
        this.delay(1000);
        webForm.pressMainMenuUser();
        this.delay(5000);
        webForm.pressUserMenuBackButton();
    }


    @Test(testName = "Navigate through Help")
    public void navigateMenuHelp()
    {
        driver.get(Utils.BASE_URL);
        WebForm webForm = new WebForm(driver);
        webForm.enterUsername();
        webForm.enterPassword();
        webForm.pressLoginButton();
        System.out.println("Login was successful");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        webForm.verifyAlertSuccess();
        //driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        try {
            webForm.pressHamburgerMenu();
            System.out.println("hamburger press passed");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("hamburger button failed");
        }
        try {
            webForm.pressHamburgerMenuFailed();
            System.out.println("hamburger press passed");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("hamburger button failed");
        }
        webForm.pressHamburgerMenu();
        webForm.pressMainMenuHomePage();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        webForm.pressHamburgerMenu();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        this.delay(5000);
        webForm.pressHamburgerMenu();
        this.delay(1000);
        webForm.pressMainMenuHelp();
        this.delay(5000);
        webForm.pressHelpMenuSupport();
        this.delay(5000);
        webForm.pressHamburgerMenu();
        this.delay(1000);
        webForm.pressMainMenuHelp();
        this.delay(5000);
        webForm.pressHelpMenuDocument();
        this.delay(5000);
        webForm.downloadHelpDocumentsAdministrationOffice();
        this.delay(500);
        System.out.println("Downloaded document: Administration & Office was successful");
        webForm.downloadHelpDocumentsDrivers();
        this.delay(500);
        System.out.println("Downloaded document: Drivers was successful");
        webForm.downloadHelpDocumentsFoodHandler();
        this.delay(500);
        System.out.println("Downloaded document: Food Handler was successful");
        webForm.downloadHelpDocumentsHeatCold();
        this.delay(500);
        System.out.println("Downloaded document: Heat and Cold was successful");
        webForm.downloadHelpDocumentsLead();
        this.delay(500);
        System.out.println("Downloaded document: Lead was successful");
        webForm.downloadHelpDocumentsManufacturingEngineering();
        this.delay(500);
        System.out.println("Downloaded document: Manufacturing & Engineering was successful");
        webForm.downloadHelpDocumentsMining();
        this.delay(500);
        System.out.println("Downloaded document: Mining was successful");
        webForm.downloadHelpDocumentsRadiation();
        this.delay(500);
        System.out.println("Downloaded document: Radiation was successful");
        webForm.downloadHelpDocumentsSeafarers();
        this.delay(500);
        System.out.println("Downloaded document: Seafarers was successful");
        webForm.downloadHelpDocumentsSecurity();
        this.delay(500);
        System.out.println("Downloaded document: Security was successful");
        webForm.pressHamburgerMenu();
        this.delay(1000);
        webForm.pressMainMenuHelp();
        this.delay(5000);
        webForm.pressHelpMenuTermsConditions();
        this.delay(5000);
        webForm.pressHamburgerMenu();
        this.delay(1000);
        webForm.pressMainMenuHelp();
        this.delay(5000);
        webForm.pressHelpMenuBackButton();
    }


    @Test(testName = "Navigate through Administration")
    public void navigateMenuAdministration()
    {
        driver.get(Utils.BASE_URL);
        WebForm webForm = new WebForm(driver);
        webForm.enterUsername();
        webForm.enterPassword();
        webForm.pressLoginButton();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        webForm.verifyAlertSuccess();
        //driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        try {
            webForm.pressHamburgerMenu();
            System.out.println("hamburger press passed");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("hamburger button failed");
        }
        try {
            webForm.pressHamburgerMenuFailed();
            System.out.println("hamburger press passed");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("hamburger button failed");
        }
        webForm.pressHamburgerMenu();
        this.delay(1000);
        webForm.pressMainMenuAdministration();
        this.delay(5000);
        webForm.pressAdminMenuCompanyAdmin();
        this.delay(5000);
        webForm.pressHamburgerMenu();
        this.delay(1000);
        webForm.pressMainMenuAdministration();
        this.delay(5000);
        webForm.pressAdminMenuUserAdmin();
        this.delay(5000);
        webForm.pressHamburgerMenu();
        this.delay(1000);
        webForm.pressMainMenuAdministration();
        this.delay(5000);
        webForm.pressAdminMenuBulkUpload();
        this.delay(5000);
        webForm.pressHamburgerMenu();
        this.delay(1000);
        webForm.pressMainMenuAdministration();
        this.delay(5000);
        webForm.pressAdminMenuDocumentUpload();
        this.delay(5000);
        webForm.pressHamburgerMenu();
        this.delay(1000);
        webForm.pressMainMenuAdministration();
        this.delay(5000);
        webForm.pressAdminMenuScriptSearch();
        this.delay(5000);
        webForm.pressHamburgerMenu();
        this.delay(1000);
        webForm.pressMainMenuAdministration();
        this.delay(5000);
        webForm.pressAdminMenuSupportAdmin();
        this.delay(5000);
        webForm.pressHamburgerMenu();
        this.delay(1000);
        webForm.pressMainMenuAdministration();
        this.delay(5000);
        webForm.pressAdminMenuGroupAdmin();
        this.delay(5000);
        webForm.pressHamburgerMenu();
        this.delay(1000);
        webForm.pressMainMenuAdministration();
        this.delay(5000);
        webForm.pressAdminMenuBackButton();
        this.delay(5000);
    }


    @Test(testName = "Navigate through Dashboard")
    public void navigateDashboard()
    {
        driver.get(Utils.BASE_URL);
        WebForm webForm = new WebForm(driver);
        webForm.enterUsername();
        webForm.enterPassword();
        webForm.pressLoginButton();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        webForm.verifyAlertSuccess();
        //driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        try {
            webForm.pressHamburgerMenu();
            System.out.println("hamburger press passed");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("hamburger button failed");
        }
        try {
            webForm.pressHamburgerMenuFailed();
            System.out.println("hamburger press passed");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("hamburger button failed");
        }
        this.delay(1000);
        webForm.pressHamburgerMenu();
        this.delay(1000);
        webForm.pressMainMenuHomePage();
        this.delay(1000);
        /////////////////////////////webForm.pressHomeDashBoardCofStatus();
        webForm.pressHomeDashBoardDraftCof();
        this.delay(5000);
        webForm.pressPageBack();
        this.delay(2000);
        webForm.pressHomeDashBoardDraftMedical();
        this.delay(5000);
        webForm.pressPageBack();
        this.delay(5000);
    }


    @Test(testName = "Enter text in fields")
    public void enterTextFields()
    {
        driver.get(Utils.BASE_URL);
        WebForm webForm = new WebForm(driver);
        webForm.enterUsername();
        webForm.enterPassword();
        webForm.pressLoginButton();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        webForm.verifyAlertSuccess();
        //driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        try {
            webForm.pressHamburgerMenu();
            System.out.println("hamburger press passed");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("hamburger button failed");
        }
        try {
            webForm.pressHamburgerMenuFailed();
            System.out.println("hamburger press passed");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("hamburger button failed");
        }
        webForm.pressHamburgerMenu();
        this.delay(1000);
        webForm.pressMainMenuHealthRecords();
        this.delay(5000);
        webForm.pressHealthRecordMenuEmployees();
        this.delay(5000);
        webForm.enterEmployeeSearchIdentification();
        this.delay(3000);
        webForm.enterEmployeeSearchDropDownSelectIdType();
        this.delay(5000);
    }


    @AfterSuite
    public static void cleanUp()
    {
        driver.manage().deleteAllCookies();
        //driver.close();
    }

    public void delay(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException ex) {
        }
    }
}