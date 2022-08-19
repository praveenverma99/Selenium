package org.example;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v101.input.Input;

import java.awt.*;
import java.awt.event.InputEvent;
import java.util.concurrent.TimeUnit;

public class Ebay{



    public static void main(String[] args) throws InterruptedException, AWTException {

      System.setProperty("webdriver.chrome.driver","C:\\Users\\vsver\\Downloads\\chromedriver_win32\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.amazon.in/");
      driver.manage().window().maximize();
      JavascriptExecutor js = (JavascriptExecutor) driver;
    //  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 13");
      driver.manage().timeouts().getScriptTimeout();
    //  driver.findElement(By.id("nav-search-submit-button")).click();
      Thread.sleep(5000);
   //   js.executeScript("window.scrollby(0,5000)");
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