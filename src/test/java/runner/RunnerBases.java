package runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class RunnerBases {
  public static WebDriver driver;
    public static WebDriver getDriver(){
        return driver;
    }

    public static WebDriver initDriver(String browser){
        if (driver!= null){
            driver.quit();
        }

        switch (browser){
            case "chrome":
                driver = new ChromeDriver();

                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            default:
                throw new IllegalArgumentException("navegador não encontrado. Passe um navegador válido");
        }

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return driver;
    }
}
