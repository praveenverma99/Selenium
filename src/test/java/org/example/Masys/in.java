package org.example.Masys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class in {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\prave\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver Driver = new ChromeDriver();

          Driver.get("https://techcabin.in/auth/sign_in.php?module=landing");
            Driver.manage().window().maximize();
            Thread.sleep(1000);
            Driver.findElement(By.xpath("//input[@id='email']")).sendKeys("praveen@simtechx.com");
            Driver.findElement(By.xpath("//body/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/p[1]/a[1]")).click();
        Thread.sleep(1000);
            Driver.navigate().to("https://techcabin.in/auth/sign_in.php?module=landing");
        System.out.println(Driver.getCurrentUrl());
        Thread.sleep(3000);
            Driver.findElement(By.xpath("//a[contains(text(),'Forgot Password?')]")).click();
        Thread.sleep(3000);
            Driver.navigate().back();
        Thread.sleep(3000);
            Driver.findElement(By.xpath("//a[contains(text(),'Create an Account')]")).click();
        Thread.sleep(3000);
            Driver.navigate().back();
            Thread.sleep(3000);
            Driver.close();
    }
}
