package week4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class TimesOfIndia {

    public static void main(String[] args) throws MalformedURLException {

        ChromeOptions options=new ChromeOptions();

        WebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/"),options);

        driver.get("https://timesofindia.indiatimes.com/");

       List<WebElement> count= driver.findElements(By.tagName("a"));

       //int value=count.size();

     long value=  count.stream().count();

        System.out.println(value);



    }

}
