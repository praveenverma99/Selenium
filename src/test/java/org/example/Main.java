package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\vsver\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

         WebElement email= driver.findElement(By.name("email"));
         WebElement password= driver.findElement(By.name("pass"));

         sendKeys(driver , email, 10, "pv@rediffmail.com" );
         sendKeys(driver, password, 20, "789");

         WebElement forgotAccount =driver.findElement(By.linkText("Forgotten password?"));
         clickOn(driver, forgotAccount, 10);


    }
       public  static void sendKeys(WebDriver driver1, WebElement element, int timeout, String value)
       {
           new WebDriverWait(driver1 , Duration.of(timeout, ChronoUnit.SECONDS)).until(ExpectedConditions.visibilityOf(element));
           element.sendKeys(value);
       }

        public static void clickOn(WebDriver driver1, WebElement element, int timeout)
        {
            new WebDriverWait(driver1, Duration.of(timeout, ChronoUnit.SECONDS)).until(ExpectedConditions.elementToBeClickable(element));
            element.click();
        }
}
