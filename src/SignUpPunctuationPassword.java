import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SignUpPunctuationPassword {
    public static void main(String[] args) {

        String EXE_PATH =  "D:\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",EXE_PATH);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--whitelisted-ips=''");
        WebDriver driver = new ChromeDriver(options);
        driver.get("http:www.pinterest.com");
        driver.manage().window().maximize();

        // space password
        driver.findElement(By.cssSelector(".a_A > .tBJ")).click();
        driver.findElement(By.id("email")).sendKeys("05baris05@gmail.com");
        driver.findElement(By.id("password")).sendKeys("165!.^<D154a;,sdbd");
        driver.findElement(By.id("age")).sendKeys("20");
        driver.findElement(By.cssSelector(".red > div")).click();


    }
}
