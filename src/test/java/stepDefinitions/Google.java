package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Google {
    WebDriver driver = new ChromeDriver();
    @Given("User is on the Google homepage")
    public void user_is_on_the_google_homepage() {
        // Write code here that turns the phrase above into concrete actions
        driver.get("https://www.google.com");
    }

    @When("User enters {string} in the search box")
    public void user_enters_in_the_search_box(String key) {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys(key);
    }

    @When("Clicks on the search button")
    public void clicks_on_the_search_button() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("/html/body/div[2]/div[4]/form/div[1]/div[1]/div[2]/div[4]/div[6]/center/input[1]")).click();
    }

    @Then("User is on Robot check page")
    public void search_results_for_should_be_displayed() {
        // Write code here that turns the phrase above into concrete actions
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.partialLinkText("About this page"))));
        System.out.println("Current url : "+driver.getCurrentUrl());
    }
}
