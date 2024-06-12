package testnghw1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class Guruhw {
	

@Test
public void guru99_registerpage() {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Lenovo\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://demo.guru99.com/test/newtours/");

	driver.findElement(By.linkText("REGISTER")).click();
	driver.findElement(By.name("firstName")).sendKeys("maya");
	driver.findElement(By.name("lastName")).sendKeys("krishnan");
	driver.findElement(By.name("phone")).sendKeys("9465767389");
	driver.findElement(By.name("userName")).sendKeys("mayakrishnan1234@gmail.com");
	driver.findElement(By.name("address1")).sendKeys("pilavilai veedu pathukani");
	driver.findElement(By.name("city")).sendKeys("Trivandrum");
	driver.findElement(By.name("state")).sendKeys("Keralam");
	driver.findElement(By.name("postalCode")).sendKeys("629101");
	driver.findElement(By.name("email")).sendKeys("mayakrishnan");
	driver.findElement(By.name("password")).sendKeys("maya1234");
	driver.findElement(By.name("confirmPassword")).sendKeys("maya1234");
	driver.findElement(By.name("submit")).click();
}}
		
		
	
	
		
	


