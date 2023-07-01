package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class fourthtest {
    WebDriver driver;
    @Test(priority = 0)
    public void launch() throws InterruptedException{
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.get("https://artisticyogav2dev.web.app/");
        Thread.sleep(1000);
    }

    @Test(priority = 1)
    public void autoscript() throws InterruptedException {
        driver.findElement(By.xpath("//p[contains(.,'Online LIVE')]")).click();
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scroll(0, 1500)");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//body/div[@id='root']/div[@class='WeightLossProgram hidden show']/div[@class='weightLossContainer']/div[1]/div[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='compareProgramsChart']//p")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//td[3]/p")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='compareProgramsChart']//p")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//td[5]/p")).click();
    }
}
