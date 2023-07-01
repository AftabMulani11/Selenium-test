package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.*;


public class firsttest {
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
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scroll(0, 900)");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[contains(.,'Book Now')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Eg. John Doe']")).sendKeys("Aftab Mulani");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='1 (702) 123-4567']")).sendKeys("7972281955");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Eg. Abc@mail.com']")).sendKeys("aftabmulani001@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[normalize-space()='Next']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='selectTagContainer']//option[@value='AY Calm']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[normalize-space()='Next']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Eg 01/01/23']")).sendKeys("07/04/2023");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//h3[normalize-space()='Schedule your Trail Class']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='selectTagContainer']//option[@value='8:20 PM']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='Next']")).click();
        Thread.sleep(4000);
    }

    @AfterTest
    public void quit() {
        driver.quit();
    }

}
