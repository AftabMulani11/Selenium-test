package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class secondtest {
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
        driver.findElement(By.xpath("//button[normalize-space()='Get Started']")).click();
        Thread.sleep(1000);
        try {
            driver.findElement(By.xpath("//input[@placeholder='1 (702) 123-4567']")).sendKeys("7888173963");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//input[@placeholder='Eg. *******']")).sendKeys("Redlake@121");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
            Thread.sleep(1000);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        Thread.sleep(2000);
        driver.findElement(By.xpath("//p[contains(.,'Online LIVE')]")).click();
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scroll(0, 1500)");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//body/div[@id='root']/div[@class='WeightLossProgram hidden show']/div[@class='weightLossContainer']/div[1]/div[1]")).click();
        Thread.sleep(3000);
        js.executeScript("window.scroll(0, 1000)");
        Thread.sleep(1500);
        js.executeScript("window.scroll(0, 1000)");
        driver.findElement(By.xpath("//div[@class='Pricing']//div[1]//button[1]")).click();
        Thread.sleep(2000);
        try {
            driver.findElement(By.xpath("//button[normalize-space()='Continue to payment']")).click();
            Thread.sleep(1000);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        /*driver.findElement(By.xpath("//input[@placeholder='1 (702) 123-4567']")).sendKeys("7972281955");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Eg. *******']")).sendKeys("Redlake@121");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        Thread.sleep(1000);*/
        /*driver.findElement(By.xpath("//span[normalize-space()='Do not have an account? Sign Up.']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Aftab");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Mulani");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='someone@example.com']")).sendKeys("aftabmulani001@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='1 (702) 123-4567']")).sendKeys("7972281955");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Redlake@121");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("Redlake@121");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[normalize-space()='Sign Up']")).click();
        Thread.sleep(1000);*/


    }
}
