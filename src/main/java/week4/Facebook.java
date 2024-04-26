package week4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Facebook {

    public static void main(String[] args) throws MalformedURLException {

        ChromeOptions options=new ChromeOptions();

        WebDriver wd=new RemoteWebDriver(new URL("http://localhost:4444"),options);

        wd.get("https://www.facebook.com/");

        wd.findElement(By.xpath("//input[@name='email']")).sendKeys("");

        wd.findElement(By.xpath("//input[@type='password']")).sendKeys("");

        wd.findElement(By.xpath("//button[@type='submit']")).click();



    }
}
