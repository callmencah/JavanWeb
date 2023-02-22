package StepDefinitions;

import Config.Env;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;

public class Hooks extends Env{

    @Before
    public void before() {
        // Call WebDriverManager Library
        WebDriverManager.chromedriver().setup();
        ChromeOptions opt = new ChromeOptions();
        opt.setHeadless(false);
        driver = new ChromeDriver(opt);
        // Get To Url
        driver.get("https://javan.co.id/");
        // maximize screen & close driver in 10 seconds if there is an issue
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @After
    public void after(){
//    driver.quit();
    }
}