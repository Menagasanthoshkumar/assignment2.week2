package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		// implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		//	 2	Enter the username
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");

		//	 3	Enter the password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");

		//	 4	Click Login
		driver.findElement(By.xpath("(//form[@id='login']//input)[3]")).click();

		//	 5	Click crm/sfa link
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();

		//	 6	Click Leads link
		driver.findElement(By.xpath("//a[text()='Leads']")).click();

		//	 7	Click Find leads
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();

		//	 8	Enter first name
		driver.findElement(By.xpath("(//input[@name ='firstName'])[3]")).sendKeys("Menaga");

		//	 9	Click Find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		

		//	 10 Click on first resulting lead
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();

		//	 11 Verify title of the page
		System.out.println(driver.getTitle());

		//	 12 Click Edit
		driver.findElement(By.xpath("//a[text()='Edit']")).click();

		//	 13 Change the company name
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("MindLeaf");

		//	 14 Click Update
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();

		//	 15 Confirm the changed name appears
		String compName = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		System.out.println(compName);
		

		//	 16 Close the browser (Do not log out)
		driver.close();



	}

}
