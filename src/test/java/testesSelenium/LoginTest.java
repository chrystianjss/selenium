package testesSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginTest  {
    public static void main(String[] args) {
    	System.setProperty("webdriver.edge.driver", "C:\\Users\\Chrystian Soares\\Downloads\\MicrosoftWebDriver.exe");
    	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chrystian Soares\\Downloads\\chromedriver.exe");
    	WebDriver driver = new EdgeDriver();
    	
        driver.get("http://localhost:8080/selenium/login.xhtml");
        
        //WebElement element = driver.findElement(By.id("j_idt6:inputNome"));
        WebElement element = driver.findElement(By.xpath("//*[contains(@id, 'inputLogin')]"));
        element.sendKeys("admin");
        
        //element = driver.findElement(By.id("inputSenha"));
        element = driver.findElement(By.xpath("//*[contains(@id, 'inputSenha')]"));
        element.sendKeys("123");
        
        element.submit();

        System.out.println("Page title is: " + driver.getTitle());
        //driver.quit();
    }
}
