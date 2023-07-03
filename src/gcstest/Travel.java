package gcstest;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Travel 
{
@Test
public void Desk()
 {
   WebDriver driver = new ChromeDriver();
   driver.get("http://20.219.145.143/signin");
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   driver.findElement(By.xpath("//input[@type='text']")).sendKeys("GI2600",Keys.TAB,"@123#",Keys.ENTER);
   driver.findElement(By.xpath("//div[text()='Home']"));
   	/*Travel Request*/
   driver.findElement(By.xpath("(//div[@Class='ant-menu-submenu-title'])[6]")).click();
   driver.findElement(By.xpath("//a[@href='/travel_desk/request']")).click();
 }
}