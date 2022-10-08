package Module001.Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class Commands {

    public static void main(String[] args) {

                 System.setProperty("webdriver.chrome.driver","C:\\Users\\prave\\chromedriver_win32 (1)\\chromedriver.exe");
                  WebDriver  driver = new ChromeDriver();

                  driver.get("https://www.amazon.in/");
                 System.out.println(driver.getTitle());

                   driver.navigate();

        System.out.println(driver.getCurrentUrl());
        String test =driver.findElement(By.xpath("//a[contains(text(),'Sign in securely')]")).getText();
        System.out.println(test);
        driver.close();
    }
}
