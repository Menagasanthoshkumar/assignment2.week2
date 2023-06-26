package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		// Launch the browser
				ChromeDriver driver = new ChromeDriver();

				// Load the URL https://en-gb.facebook.com/
				driver.get("https://en-gb.facebook.com/");

				// Maximise the window
				driver.manage().window().maximize();

				// Add implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

				// If cookies options doesn't appears comment the following code
				driver.findElement(By.xpath("//button[contains(text(),'optional')]"+ "")).click();

				// Click on Create New Account button
				driver.findElement(By.xpath("//a[text()='Create new account']")).click();		

				// Enter the first name		
				driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("Menaga");

				// Enter the last name
				driver.findElement(By.xpath("//div[text()='Surname']/following-sibling::input")).sendKeys("Santhosh");

				// Enter the mobile number
				driver.findElement(By.xpath("(//div[@class='placeholder']/following-sibling::input)[3]")).sendKeys("8668028319");

				// Enter the password
				driver.findElement(By.xpath("(//div[@class='placeholder']/following-sibling::input)[5]")).sendKeys("anidra");

				// Handle all the three drop downs
				// Date of D.O.B -> find and select
				WebElement dOBDrop1 = driver.findElement(By.id("day"));
				Select options1 = new Select(dOBDrop1);
				options1.selectByVisibleText("25");

				// Month of D.O.B -> find and select
				WebElement dOBDrop2 = driver.findElement(By.id("month"));
				Select options2 = new Select(dOBDrop2);
				options2.selectByIndex(8);

				// Year of D.O.B -> find and select
				WebElement dOBDrop3 = driver.findElement(By.xpath("//*[@id='year']"));
				Select options3 = new Select(dOBDrop3);
				options3.selectByValue("1964");

				// Select the radio button "Female" (A normal click will do for this step) 
				driver.findElement(By.xpath("//label[text()='Male']")).click();

	}

}
