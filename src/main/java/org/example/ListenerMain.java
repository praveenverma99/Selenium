package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverListener;

import static net.bytebuddy.implementation.MethodDelegation.to;

public class ListenerMain {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\vsver\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver ;
        EventFiringWebDriver eventhandler = new EventFiringWebDriver(driver);
        EventCapture eCapture = new EventCapture();
        eventhandler.register(eCapture);
        eventhandler.navigate().to("https://www.edureka.co/blog/");
        js.executeScript("window.scrollBy(0,400)");
        Thread.sleep(3000);
        eventhandler.findElement(By.cssSelector("Software Testing"));
        eventhandler.navigate().to("https://www.edureka.co/all-courses");
        eventhandler.navigate().back();
        eventhandler.quit();
        eventhandler.unregister(eCapture);
        System.out.println("end");
    }
}
