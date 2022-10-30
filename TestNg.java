import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNg {
		WebDriver driver;
		@BeforeTest
		public void BT()  {
			
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
			driver.navigate().to(url);

		}
		
		@Test(priority = 0)
		public void testcase1() throws InterruptedException {
			Thread.sleep(3000);
			driver.findElement(By.name("username")).sendKeys("Admin");
			Thread.sleep(5000);
			driver.findElement(By.name("password")).sendKeys("admin123");
			driver.findElement(By.xpath("//*[@type='submit']")).click();
			
			Thread.sleep(3000);
			
					List<WebElement> links = driver.findElements(By.tagName("a"));
					// print total number of links 
					System.out.println("Total number of links:"+links.size());
					
					 for(int i=0;i<links.size();i++)
					 {
						 System.out.println(links.get(i).getText());
						 System.out.println(links.get(i).getAttribute("href"));
						 
					 }
					   // driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[2]/a")).click(); 
					    driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[3]/a")).click(); 
					    driver.findElement(By.xpath("//*[@class='oxd-topbar-body-nav-tab-item']")).click();
					    
					    List<WebElement> li = driver.findElements(By.xpath("//*[@class='oxd-table-card']"));
						System.out.print(li.size());
						Thread.sleep(5000);
						System.out.println(driver.findElements(By.xpath("//*[@class='oxd-table-card']")).get(2).getText());
						Thread.sleep(5000);
						driver.findElements(By.xpath("//*[@class='oxd-icon bi-check oxd-checkbox-input-icon']")).get(2).click();
						Thread.sleep(5000);
						driver.findElements(By.xpath("//*[@class='oxd-icon bi-trash']")).get(2).click();
						Thread.sleep(5000);
						driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")).click();
						Thread.sleep(5000);
					    driver.findElement(By.xpath("//*[@class='oxd-userdropdown']")).click();
				      Thread.sleep(5000);
				  driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]/a")).click();
		}
		}

