package skeleton.defs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Assert;

public class SearchWikipediaStepDefs {

    private WebDriver driver;

    @Before("@web")
    public void before() {
        //-Dwebdriver.chrome.driver=H:\\softwares\\chromedriver_win32\\chromedriver.exe
//        System.setProperty("webdriver.chrome.driver", "H:\\softwares\\chromedriver_win32\\chromedriver.exe");
        if (System.getProperty("webdriver.chrome.driver") == null) {
            System.setProperty("webdriver.chrome.driver", "H:\\softwares\\chromedriver_win32\\chromedriver.exe");
        }
        driver = new ChromeDriver();
        driver.navigate().to("http://en.wikipedia.org");
    }

    @After("@web")
    public void after() {
        if (driver != null) driver.quit();
    }

    @Given("^Enter search term '(.*?)'$")
    public void searchFor(String searchTerm) {
        WebElement searchField = driver.findElement(By.id("searchInput"));
        searchField.sendKeys(searchTerm);
    }

    @When("^Do search$")
    public void clickSearchButton() {
        WebElement searchButton = driver.findElement(By.id("searchButton"));
        searchButton.click();
    }

    @Then("^Search results are shown for '(.*?)'$")
    public void assertSearchResult(String searchResult) {
        WebElement results = driver
                .findElement(By.cssSelector("div#mw-content-text.mw-content-ltr p"));
//        assertFalse(results.getText().contains(searchResult + " may refer to:"));
        Assert.assertTrue(results.getText().startsWith(searchResult));
    }
}
