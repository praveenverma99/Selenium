package Headless;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless {
     public static void main(String[] args){

                        System.setProperty("webdriver.chrome.driver","C:\\Users\\prave\\chromedriver_win32 (1)\\chromedriver.exe");


                      ChromeOptions options = new ChromeOptions();
                      options.setHeadless(true);
                        options.addArguments("--headless");

                      WebDriver driver = new ChromeDriver(options);
                    driver.get("https://www.facebook.com/");
                    System.out.println(driver.getTitle());


    }
}
