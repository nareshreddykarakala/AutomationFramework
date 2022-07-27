import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class facebook {
    public void test(String toAddress) throws InterruptedException {
        var toEmails = toAddress.split("[;,]");
        System.out.println(toEmails[0]+"  "+ ""+toEmails[1]);

        /*
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        driver.findElement(By.id("email")).sendKeys("knr9198@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("naresh@harika");
        Thread.sleep(5000);
        driver.findElement(By.ByName.name("login")).click();
        Thread.sleep(7000);*/
    }

    public static void main(String[] args) throws InterruptedException {
        new facebook().test("HQ-PriceItemPlanning-DG@gap.com;nareshkumar_reddy_karakala@gap.com");
    }
}
