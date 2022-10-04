package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.SQLOutput;
import java.util.Set;

public class Facebook {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\prave\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.linkText("Create New Account")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("firstname")).sendKeys("Praveen");
        driver.findElement(By.name("lastname")).sendKeys("Verma");
        driver.findElement(By.name("reg_email__")).sendKeys("9313166345");
        driver.findElement(By.name("reg_passwd__")).sendKeys("Password@123");
        WebElement day1 = driver.findElement(By.id("day"));
        Select Day2 = new Select(day1);
        Thread.sleep(1000);
        Day2.selectByIndex(19);
        WebElement months = driver.findElement(By.id("month"));
        Select month1 = new Select(months);
        Thread.sleep(1000);
        month1.selectByVisibleText("Nov");
        WebElement Year1 = driver.findElement(By.id("year"));
        Select Year2 = new Select(Year1);
        Thread.sleep(1000);
        Year2.selectByValue("1999");
        Thread.sleep(2000);
        WebElement radio1 = driver.findElement(By.xpath("//label[contains(text(),'Custom')]"));
        radio1.click();
        Thread.sleep(1000);
        WebElement custom = driver.findElement(By.name("preferred_pronoun"));
        Select custom1 = new Select(custom);
        custom1.selectByValue("6");
        driver.findElement(By.name("custom_gender")).sendKeys("I don't know");
        Thread.sleep(1000);
         driver.findElement(By.cssSelector("#non-users-notice-link")).click();
        Thread.sleep(3000);

        String originalWindow = driver.getWindowHandle();
        driver.switchTo().window(originalWindow);
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#terms-link")).click();
        Thread.sleep(3000);
        driver.switchTo().window(originalWindow);
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("#privacy-link")).click();
        Thread.sleep(3000);

        driver.switchTo().window(originalWindow);
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("#cookie-use-link"));
        Thread.sleep(5000);
        driver.switchTo().window(originalWindow);

        String A =  driver.getTitle();
        System.out.println(A);
        Set<String> tabs = driver.getWindowHandles();
        for (String tab : tabs) {
            if(!tab.equalsIgnoreCase(originalWindow)) {
                driver.switchTo().window(tab);
                driver.close();
            }

        }
        driver.switchTo().window(originalWindow);

          driver.findElement(By.name("websubmit")).click();
         Thread.sleep(2000);
          driver.quit();


    }
}
