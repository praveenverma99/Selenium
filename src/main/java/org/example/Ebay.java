package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay{

    public static void main(String[] args) {

      System.setProperty("webdriver.chrome.driver","C:\\Users\\vsver\\Downloads\\chromedriver_win32\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.ebay.com/");
      driver.manage().window().maximize();
      JavascriptExecutor js = (JavascriptExecutor) driver;
      driver.findElement(By.cssSelector("#gh-ac")).sendKeys("Iphone 12");
      driver.findElement(By.cssSelector("#gh-btn")).click();
      js.executeScript("window.scrollby(0,300)");
    }
}