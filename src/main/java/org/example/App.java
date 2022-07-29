package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static WebDriver driver = null;

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        System.setProperty("webdriver.chrome.driver","C:\\Users\\vsver\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.navigate().to("https://www.amazon.in/");
        driver.manage().window().maximize();

    }
}
