package programs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;



// ("//div[@class='s-suggestion-container']")
// //input[@id='twotabsearchtextbox']")


public class Amazon {

    public static class BrokenLinks {

        public static void main(String[] args) throws InterruptedException {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://amazon.com");
            Thread.sleep(3000);

            By search = By.xpath("//input[@id='twotabsearchtextbox']");
            By suggestions = By.xpath("//div[@class='s-suggestion-container']");

            WebDriverWait wait = new WebDriverWait(driver, 10);
            WebElement searchBar =   wait.until(ExpectedConditions.presenceOfElementLocated(search));

            searchBar.sendKeys("watches");

            WebElement suggestionsAppearing =   wait.until(ExpectedConditions.presenceOfElementLocated(suggestions));

            List<WebElement> suggestionList = driver.findElements(suggestions);

            String fourtElement = suggestionList.get(3).getText();

            for(int i=0; i<suggestionList.size(); i++){
            if(suggestionList.get(i).getText().equals(fourtElement)){
                suggestionList.get(i).click();
            }

            }
        }








//            driver.quit();
        }

}
