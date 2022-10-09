package Headless;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

    public static void main(String[] args) throws InterruptedException {

                   System.setProperty("webdriver.chrome.driver","C:\\Users\\prave\\chromedriver_win32 (1)\\chromedriver.exe" );
                       WebDriver driver = new ChromeDriver();

              driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
              System.out.println(driver.getTitle());
              Thread.sleep(3000);
              driver.navigate().to("https://www.townscript.com/in/online");
        System.out.println(driver.getTitle());
              Thread.sleep(3000);
              driver.navigate().back();
        System.out.println(driver.getTitle());
               Thread.sleep(3000);
               driver.navigate().forward();
        System.out.println(driver.getTitle());
    }
}
