package Headless;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class ConditionalCommands {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\prave\\chromedriver_win32 (1)\\chromedriver.exe" );
        WebDriver Driver = new ChromeDriver();

              Driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525804944%7Cb%7Cfacebook%20%27%7C&placement=&creative=550525804944&keyword=facebook%20%27&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-327195741349%26loc_physical_ms%3D9061697%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjwv4SaBhBPEiwA9YzZvLUgP2Rs0Iz5i_bPSAJATp1n8nzRFgpR82gsTauA76cIq1BBY6xKSxoC4VQQAvD_BwE");
               Thread.sleep(5000);
              WebElement email = Driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
              WebElement pass = Driver.findElement(By.cssSelector("#u_0_g_Gc"));

                    if(email.isDisplayed() && email.isEnabled())
                    {
                                email.sendKeys("praveen");
                    }
                    if (pass.isDisplayed() && pass.isEnabled())
                    {
                        pass.sendKeys("9313166345");
                    }
        System.out.println(Driver.findElement(By.xpath("//label[contains(text(),'Female')]")).isSelected());
        System.out.println(Driver.findElement(By.xpath("//label[contains(text(),'Male')]")).isSelected());
        System.out.println(Driver.findElement(By.xpath("//label[contains(text(),'Custom')]")).isSelected());
        System.out.println("");
        Driver.close();
    }
}
