import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumDemo {

    public static void main(String[] args) throws MalformedURLException {


        //input[@name='email']

       // WebDriver wd = new ChromeDriver();

        ChromeOptions options=new ChromeOptions();

        WebDriver wd =new RemoteWebDriver(new URL("http://localhost:4444"),options);

       wd.get("https://demo.evershop.io/account/login");

        wd.findElement(By.xpath("//input[@name='email']")).sendKeys("akhiljda@gmail.com");



    }

}
