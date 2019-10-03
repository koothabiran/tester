package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class class1 {
	public static WebDriver driver;
	public static String URL="https://www.flipkart.com/";
	 
  @Test(priority=1)
  public void openbrowser() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Koothabiran\\eclipse-workspace\\study\\drivers\\chromedriver (2).exe");
	 driver = new ChromeDriver();
	  driver.get(URL);
	  driver.manage().window().maximize();
	 Thread.sleep(5000);
	  
	  
  }
  
  @Test(priority=2)
  public void login() throws InterruptedException
	{
	  //Enter username
	  driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("8668030889");
	  Thread.sleep(4000);
	  
	  //Enter Password
	  driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("thulasi");
	  Thread.sleep(2000);

	  //click on login
	  driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")).click();
	  Thread.sleep(2000);
  
}
  
  
}
