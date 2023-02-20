package Config;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

public class Env {
    Faker faker = new Faker();
    protected static WebDriver driver;
    public static WebDriverWait wait;
    public Random rand = new Random();

}
