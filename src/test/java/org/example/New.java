package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import java.util.List;
import java.util.Set;
import java.util.Iterator;
public class New {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", ";C:\\Users\\prave\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://secure.indeed.com/account/login");
        //implicit wait
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.findElement(By.id("login-google-button")).click();
        // window handles
        Set w = driver.getWindowHandles();
        // window handles iterate
        Iterator t = w.iterator();
        String ch = (String) t.next();
        String pw = (String) t.next();
        // switching child window
        driver.switchTo().window(ch);
        System.out.println("Child window title " + driver.getTitle());
        // close the child browser window
        driver.close();
        // switching parent window
        driver.switchTo().window(pw);
        System.out.println("Parent window title: " + driver.getTitle());
        driver.quit();
    }
}