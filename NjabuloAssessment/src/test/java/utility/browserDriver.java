package utility;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class browserDriver {
  public static   WebDriver driver =new ChromeDriver();
   @Before
   public void before() {
       WebDriverManager.chromedriver().setup();
       driver.manage().window().maximize();
   }
    @After
    public static void quit() {
        driver.quit();
    }
}
