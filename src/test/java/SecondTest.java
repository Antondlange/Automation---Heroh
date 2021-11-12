import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SecondTest
{
    @Test(testName = "Navigate through Help")
    public void submitForm10()
    {
        final WebDriver driver = new ChromeDriver();
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
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
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

    public void delay(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException ex) {
        }
    }


}
