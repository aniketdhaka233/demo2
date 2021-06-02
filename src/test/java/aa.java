
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class aa {
    WebDriver driver;

    @Given("^Open Chrome and start Application$")
    public void openChromeAndStartApplication() {
        System.setProperty("webdriver.chrome.driver", "//Users//aniketdhaka//Downloads//chromedriver");
        driver = new ChromeDriver();
        driver.get("https://qa-green.jitterbit.com/");

    }

}
    @When("^I enter a username and password$")
    public void iEnterAUsernameAndPassword(){
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("ayushi.dhaka+green2@jitterbit.com");
        driver.findElement(By.xpath("//*[@id=\"loginform\"]/div[2]/input")).sendKeys("7Iron-hide");
    }

    @Then("^User logged in Successfully$")
    public void userLoggedInSuccessfully(){
        driver.findElement(By.xpath("//*[@id=\"loginform\"]/div[4]/button")).click();
    }
}

