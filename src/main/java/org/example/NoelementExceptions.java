package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoelementExceptions {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\vsver\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");
        driver.manage().window().maximize();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            driver.findElement(By.name("Praveen")).click();
        }
        catch (Exception e) {
            System.out.println("No such element found onPage");
            System.out.println("Hello");
        }
        System.out.println("Hello");
    }
}
