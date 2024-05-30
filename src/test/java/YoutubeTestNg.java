import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class YoutubeTestNg {

    @Test
    public void youtubehomepage(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\paran\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.youtube.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.urlToBe(driver.getCurrentUrl()));


        WebElement search = driver.findElement(By.xpath("//div[@id='search-input'] /input"));
        search.sendKeys("T20 videos");

        WebElement clickoption = driver.findElement(By.id("search-icon-legacy"));
        clickoption.click();
        driver.quit();

    }
}
