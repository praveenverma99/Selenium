package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Ebay{

    public static void main(String[] args) throws InterruptedException {

      System.setProperty("webdriver.chrome.driver","C:\\Users\\vsver\\Downloads\\chromedriver_win32\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.amazon.in/");
      driver.manage().window().maximize();
      JavascriptExecutor js = (JavascriptExecutor) driver;
      driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 13");
      driver.manage().timeouts().getScriptTimeout();
      driver.findElement(By.id("nav-search-submit-button")).click();
      Thread.sleep(5000);
      js.executeScript("window.scrollby(0,5000)");

    }
}