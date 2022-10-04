package org.example;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.awt.*;
import java.awt.event.InputEvent;

public class Amazon {



    public static void main(String[] args) throws InterruptedException, AWTException {

      System.setProperty("webdriver.chrome.driver","C:\\Users\\prave\\chromedriver_win32 (1)\\chromedriver.exe");
      ChromeOptions options = new ChromeOptions();
      options.setHeadless(true);
      WebDriver driver = new ChromeDriver(options);

      driver.get("https://www.amazon.in/");
      System.out.println("website title : " + driver.getTitle());
      driver.manage().window().maximize();
      JavascriptExecutor js = (JavascriptExecutor) driver;
      driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 13");
      driver.manage().timeouts().getScriptTimeout();
      driver.findElement(By.id("nav-search-submit-button")).click();
      Thread.sleep(10000);
      js.executeScript("window.scrollby(0,50000)");
      driver.findElement(By.id("")).click();
      Alert alert = driver.switchTo().alert();
      String alertmessage = driver.switchTo().alert().getText();
      System.out.println(alertmessage);
      Thread.sleep(2000);
      alert.accept();
      Robot robot = new Robot();
      robot.mouseMove(100,100);
      robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
      robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
      driver.quit();


    }
}