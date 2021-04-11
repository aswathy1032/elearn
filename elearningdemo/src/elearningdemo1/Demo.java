package elearningdemo1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Demo { 

	public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","E:\\chrome version\\89\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://elearningm1.upskills.in/");
        WebElement username = driver.findElement(By.id("login"));
        if(username.isEnabled())
        {
	        username.clear();
	        username.sendKeys("aswathynag");
	
        }
        if(username.isDisplayed()) 
        {
	       WebElement pwd = driver.findElement(By.id("password"));
	       pwd.clear();
	       pwd.sendKeys("Aswathy@1032");
           driver.findElement(By.name("submitAuth")).click();
	       Thread.sleep(3000);
	       driver.findElement(By.linkText("Edit profile")).click();

           WebElement newpassword = driver.findElement(By.name("password1"));
	       newpassword.clear();
	       newpassword.sendKeys("Aswathy@1032");
	       
	       WebElement confirmpassword = driver.findElement(By.name("password2"));
	       confirmpassword.clear();
	       confirmpassword.sendKeys("Aswathy@1032");
	       driver.findElement(By.linkText("dropdown-menu")).click();
	       driver.findElement(By.xpath("//*[id='logout_button']/ul/li[2]/a")).click();
	       
	       
	       List<WebElement>link = driver.findElements(By.tagName("a"));
	       System.out.println(link.size());	
	       for(int i=0;i<link.size();i++)
	       {
		      System.out.println(link.get(i).getText());
	       }
        }
	}
}


