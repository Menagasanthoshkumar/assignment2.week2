package week2.day1;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;




public class CreateContent {
	public static void main(String[] args) {
		
	            ChromeDriver driver = new ChromeDriver();
				driver.get("http://leaftaps.com/opentaps/control/login");
				driver.manage().window().maximize();		
                driver.findElement(By.id("username")).sendKeys("demosalesManager");
                driver.findElement(By.id("password")).sendKeys("crmsfa");
                driver.findElement(By.className("decorativeSubmit")).click();
                driver.findElement(By.partialLinkText("CRM")).click();
                driver.findElement(By.linkText("Contacts")).click();
                driver.findElement(By.linkText("Create Contact")).click();
                driver.findElement(By.id("firstNameField")).sendKeys("MENAGA");
                driver.findElement(By.id("lastNameField")).sendKeys("m.s");
                driver.findElement(By.name("submitButton")).click();
                System.out.println(driver.findElement(By.id("viewContact_firstName_sp")).getText());

				System.out.println(driver.getTitle());
                 driver.close();

	}

}
