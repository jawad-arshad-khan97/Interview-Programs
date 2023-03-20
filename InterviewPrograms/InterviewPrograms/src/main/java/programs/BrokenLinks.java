package programs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.bouncycastle.util.encoders.UrlBase64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class BrokenLinks {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amazon.com");

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("No of Links are :" + links.size());

        List<String> urlList = new ArrayList<String>();

        for (WebElement e : links) {
            String url = e.getAttribute("href");
            urlList.add(url);

        }

        urlList.parallelStream().forEach(e -> checkBrokenLink(e));

        driver.quit();
    }


    public static void checkBrokenLink(String linkUrl) {
        try {
            URL url = new URL(linkUrl);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.connect();

            if (httpURLConnection.getResponseCode() >= 400) {
                System.out.println("-->" + httpURLConnection.getResponseCode() + " is broken link: " + linkUrl);
            } else {
                System.out.println("-->" + httpURLConnection.getResponseCode()+ " link:" + linkUrl);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
