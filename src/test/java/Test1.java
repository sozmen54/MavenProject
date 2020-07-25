import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {

    @Test
    public void navigateTo(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com/");

    }

    @Given("^Navigate to website$")
    public void navigate_to_website() throws Throwable {

        System.out.println("Hello cucumber");

    }
}
