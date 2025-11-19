package stepDefinitions;

import Utilities.ConfigReader;
import Utilities.DriverFactory;
import Utilities.GetSnap;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

import java.io.IOException;
import java.time.Duration;

public class Google {
    WebDriver driver; // WebDriver instance
    BasePage bp; // SearchPage instance

    @Given("User is on the Google homepage")
    public void user_is_on_the_google_homepage() {
        // Write code here that turns the phrase above into concrete actions
        driver = DriverFactory.getDriver();
        driver.get(ConfigReader.getProperty("baseUrl"));
        bp = new BasePage(driver);
    }

    @When("User searches {string} in the search box")
    public void user_enters_in_the_search_box(String key) {
        // Write code here that turns the phrase above into concrete actions
        WebElement e = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
        bp.click(e);
        bp.type(e,key);
    }

    @Then("User is on Robot check page")
    public void search_results_for_should_be_displayed() throws IOException {
        // Write code here that turns the phrase above into concrete actions
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.partialLinkText("About this page"))));
        System.out.println("Current url : "+bp.getPageTitle());
        GetSnap.capture(driver);
    }
}
