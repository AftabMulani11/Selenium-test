package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class thirdtest {
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
        driver.findElement(By.xpath("//h4[@class='viewTimings']")).click();
        Thread.sleep(2000);
        System.out.println("timing for online class are");
        List<WebElement> times = driver.findElements(By.className("timeSlots"));
        System.out.println("There are total "+times.size() + " timings available");
        //System.out.println("all batches for male and female are");
        List<WebElement> all = driver.findElements(By.className("all"));
        System.out.println("all batches have "+all.size()+" timing");
        for (WebElement ele : all) {
            System.out.println(ele.getText());
        }
        //System.out.println("only female batches are");
        List<WebElement> female = driver.findElements(By.className("ladiesTime"));
        System.out.println("only female batches have "+(female.size()-1)+" timing");
        for (int i = 0; i < female.size() -1; i++) {
            WebElement ele = female.get(i);
            System.out.println(ele.getText());
        }
        System.out.println("end of online timimg");
        System.out.println("timing for studio class");
        Thread.sleep(1500);
        driver.findElement(By.xpath("//div[2]/div/div[2]/h4")).click();
        Thread.sleep(1000);
        List<WebElement> studiotimes = driver.findElements(By.className("timeSlots"));
        System.out.println("There are total "+studiotimes.size() + " timings available in studio");
        //System.out.println("all batches for male and female are");
        List<WebElement> studioall = driver.findElements(By.className("all"));
        System.out.println("all batches have "+studioall.size()+" timing");
        for (WebElement ele : studioall) {
            System.out.println(ele.getText());
        }
        //System.out.println("only female batches are");
        List<WebElement> studiofemale = driver.findElements(By.className("ladiesTime"));
        System.out.println("only female batches have "+(studiofemale.size()-1)+" timing");
        for (int i = 0; i < studiofemale.size() -1; i++) {
            WebElement ele = studiofemale.get(i);
            System.out.println(ele.getText());
        }
    }
}
