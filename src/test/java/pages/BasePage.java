package pages; // Base class for all page objects

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    protected WebDriver driver; // Shared driver across all pages

    // Constructor: receives driver from child classes
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    // Click action wrapper
    public void click(WebElement element) {
        element.click();
    }

    // Type text into input field
    public void type(WebElement element, String text) {
        element.clear();
        element.sendKeys(text+ Keys.ENTER);
    }

    // Get page title
    public String getPageTitle() {
        return driver.getCurrentUrl();
    }
}
